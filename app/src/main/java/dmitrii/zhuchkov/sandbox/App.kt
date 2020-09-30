package dmitrii.zhuchkov.sandbox

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dmitrii.zhuchkov.sandbox.di.DaggerApp
import javax.inject.Inject

/**
 * Created by Dmitrii on 11.12.2019
 *
 */
class App : DaggerApp(), HasAndroidInjector {

    init {
        component.inject(this)
    }

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector

}