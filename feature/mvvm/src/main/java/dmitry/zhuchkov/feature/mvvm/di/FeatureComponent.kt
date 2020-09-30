package dmitry.zhuchkov.feature.mvvm.di

import dagger.Component
import dmitry.zhuchkov.component.dagger.ModuleScope
import dmitry.zhuchkov.feature.mvvm.ui.MvvmFragment

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
@ModuleScope
@Component(
    dependencies = [FeatureMvvmDependencies::class],
    modules = [FeatureModule::class]
)
internal interface FeatureComponent {

    fun inject(fragment: MvvmFragment)

    @Component.Factory
    interface Factory {

        fun create(deps: FeatureMvvmDependencies): FeatureComponent
    }
}