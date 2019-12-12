package dmitrii.zhuchkov.sandbox.di.feature

import dagger.Binds
import dagger.Module
import dmitrii.zhuchkov.sandbox.navigation.feature.SplashRouterImpl
import dmitry.zhuchkov.feature.splash.navigation.SplashRouter

/**
 * Created by Dmitrii on 14.12.2019
 *
 */
@Module
interface SplashModule {

    @Binds
    fun bindSplashRouter(router: SplashRouterImpl): SplashRouter
}