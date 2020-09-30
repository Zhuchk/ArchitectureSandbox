package dmitrii.zhuchkov.sandbox.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dmitrii.zhuchkov.sandbox.navigation.RouterImpl
import dmitry.zhuchkov.component.dagger.AppScope
import dmitry.zhuchkov.component.navigation.NavigationEventProvider
import dmitry.zhuchkov.component.navigation.NavigationEventProviderImpl
import dmitry.zhuchkov.component.navigation.Router

/**
 * Created by Dmitrii on 11.12.2019
 *
 */
@Module
abstract class NavigationModule {

    @Module
    companion object {

        @Provides
        @JvmStatic
        fun provideRouter(provider: NavigationEventProvider): Router =
            RouterImpl(provider)
    }

    @Binds
    @AppScope
    abstract fun bindNavigationActionProvider(provider: NavigationEventProviderImpl): NavigationEventProvider
}