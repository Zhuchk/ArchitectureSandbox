package dmitrii.zhuchkov.sandbox.di

import android.app.Application
import dmitry.zhuchkov.feature.mvvm.di.FeatureMvvmDependencies

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
open class DaggerApp : Application(), FeatureMvvmDependencies.FeatureMvvmDepProvider {

    val component: AppComponent by lazy {
        DaggerAppComponent.factory()
            .create(this)
    }

    override fun get(): FeatureMvvmDependencies =
        component
}