package dmitry.zhuchkov.feature.mvvm.di

import dagger.Binds
import dagger.Module
import dmitry.zhuchkov.component.dagger.ModuleScope
import dmitry.zhuchkov.feature.mvvm.data.repository.ScreenTextRepositoryImpl
import dmitry.zhuchkov.feature.mvvm.domain.repository.ScreenTextRepository

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
@Module
internal interface FeatureModule {

    @Binds
    @ModuleScope
    fun bindRepository(repository: ScreenTextRepositoryImpl): ScreenTextRepository
}