package dmitrii.zhuchkov.sandbox

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dmitrii.zhuchkov.sandbox.di.DaggerAppComponent
import javax.inject.Inject

/**
 * Created by Dmitrii on 11.12.2019
 *
 */
class App : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.factory()
            .create(this)
            .inject(this)
    }
}