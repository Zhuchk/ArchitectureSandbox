package dmitry.zhuchkov.component.mvp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

/**
 * Created by Dmitrii on 12.12.2019
 *
 */
abstract class MVPFragment: Fragment(), HasAndroidInjector {

    private val presenters: MutableList<MVPPresenter<*>> = mutableListOf()

    open fun onBackPressed(): Boolean = false

    open fun setupView() = Unit

    abstract val layoutRes: Int

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        super.onCreateView(inflater, container, savedInstanceState).let {
            inflater.inflate(layoutRes, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()

        javaClass.fields.forEach { field ->
            val presenter = field.get(this) as? MVPPresenter<out MVPView>

            if (presenter != null) {
                presenters.add(presenter)
                presenter.attachView(this as? MVPView)
            }
        }
    }

    override fun onDestroy() {
        presenters.forEach {
            it.attachView(null)
            it.disposeOnDestroy()
        }
        presenters.clear()

        super.onDestroy()
    }
}