package dmitrii.zhuchkov.sandbox.di.feature

import dagger.Binds
import dagger.Module
import dmitrii.zhuchkov.sandbox.navigation.feature.MainRouterImpl
import dmitry.zhuchkov.feature.main.navigation.MainRouter

/**
 * Created by Dmitrii on 01.10.2020
 *
 */
@Module
interface MainModule {

    @Binds
    fun bindSplashRouter(router: MainRouterImpl): MainRouter
}