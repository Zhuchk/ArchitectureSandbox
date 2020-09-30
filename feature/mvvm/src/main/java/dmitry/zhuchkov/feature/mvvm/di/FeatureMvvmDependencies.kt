package dmitry.zhuchkov.feature.mvvm.di

import dmitry.zhuchkov.component.navigation.NavigationEventProvider
import dmitry.zhuchkov.feature.mvvm.data.datasource.ExternalDataSource

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
interface FeatureMvvmDependencies {

    interface FeatureMvvmDepProvider {
        fun get(): FeatureMvvmDependencies
    }

    fun getNavEventProvider(): NavigationEventProvider

    fun getExternalDataSource(): ExternalDataSource
}