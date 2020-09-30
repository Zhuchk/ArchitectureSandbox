package dmitry.zhuchkov.feature.mvvm.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import dmitry.zhuchkov.feature.mvvm.R
import dmitry.zhuchkov.feature.mvvm.di.DaggerFeatureComponent
import dmitry.zhuchkov.feature.mvvm.di.FeatureComponent
import dmitry.zhuchkov.feature.mvvm.di.FeatureMvvmDependencies
import dmitry.zhuchkov.feature.mvvm.presentation.FeatureViewModel
import kotlinx.android.synthetic.main.mvvm_fragment.*
import javax.inject.Inject

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
class MvvmFragment : Fragment() {

    private val component: FeatureComponent by lazy {
        DaggerFeatureComponent
            .factory()
            .create((requireActivity().application as FeatureMvvmDependencies.FeatureMvvmDepProvider).get())
    }

    @Inject
    lateinit var viewModel: FeatureViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        super.onCreateView(inflater, container, savedInstanceState).let {
            inflater.inflate(R.layout.mvvm_fragment, container, false)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.viewState.observe(this, Observer { state ->
            displayedText.text = state.displayText
        })

        initListeners()

        viewModel.loadScreenText()
    }

    private fun initListeners() {
        backButton.setOnClickListener { viewModel.navigateBack() }
    }
}