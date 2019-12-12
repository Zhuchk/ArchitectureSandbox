package dmitry.zhuchkov.component.mvp

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Dmitrii on 14.12.2019
 *
 */
abstract class MVPPresenter<T: MVPView> {

    val compositeDisposable = CompositeDisposable()

    var viewState: T? = null

    open fun onCreateView() = Unit

    fun attachView(viewState: MVPView?) {
        this.viewState = viewState as? T
        onCreateView()
    }

    fun disposeOnDestroy() {
        compositeDisposable.clear()
    }
}