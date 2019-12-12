package dmitrii.zhuchkov.sandbox.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dmitrii.zhuchkov.sandbox.di.feature.SplashModule
import dmitry.zhuchkov.feature.main.ui.MainFragment
import dmitry.zhuchkov.feature.splash.ui.SplashFragment

/**
 * Created by Dmitrii on 11.12.2019
 *
 */
@Module
interface LaunchActivityModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [SplashModule::class])
    fun getSplashFragment(): SplashFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun getMainFragment(): MainFragment
}