package dmitrii.zhuchkov.sandbox.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dmitrii.zhuchkov.sandbox.LaunchActivity

/**
 * Created by Dmitrii on 11.12.2019
 *
 */
@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        NavigationModule::class,
        FeatureModule::class
    ]
)
interface AppModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [LaunchActivityModule::class])
    fun provideLaunchActivity(): LaunchActivity
}