package dmitrii.zhuchkov.sandbox.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dmitrii.zhuchkov.sandbox.App
import javax.inject.Singleton

/**
 * Created by Dmitrii on 11.12.2019
 *
 */
@AppScope
@Component(modules = [
    AppModule::class
])
interface AppComponent : AndroidInjector<App> {

    @Singleton
    @Component.Factory
    interface AppFactory {

        fun create(@BindsInstance context: Context): AppComponent
    }
}