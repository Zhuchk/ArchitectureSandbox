package dmitry.zhuchkov.feature.splash.ui

import dmitry.zhuchkov.component.mvp.MVPFragment
import dmitry.zhuchkov.feature.splash.R
import dmitry.zhuchkov.feature.splash.presentation.SplashPresenter
import dmitry.zhuchkov.feature.splash.presentation.SplashView
import javax.inject.Inject

/**
 * Created by Dmitrii on 12.12.2019
 *
 */
class SplashFragment : MVPFragment(), SplashView {

    override val layoutRes: Int = R.layout.splash_fragment

    @Inject
    lateinit var presenter: SplashPresenter
}