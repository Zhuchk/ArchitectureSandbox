package dmitry.zhuchkov.feature.splash.presentation

import dmitry.zhuchkov.component.mvp.MVPPresenter
import dmitry.zhuchkov.feature.splash.navigation.SplashRouter
import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by Dmitrii on 12.12.2019
 *
 */
class SplashPresenter @Inject constructor(
    private val router: SplashRouter
) : MVPPresenter<SplashView>() {

    private companion object {
        const val DELAY_SEC = 1L
    }

    override fun onCreateView() {
        Completable.timer(DELAY_SEC, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                router.openMainScreen()
            }
            .addTo(compositeDisposable)
    }
}