package dmitrii.zhuchkov.sandbox.external

import dagger.Binds
import dagger.Module
import dmitry.zhuchkov.feature.mvvm.data.datasource.ExternalDataSource

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
@Module
interface MvvmFeatureModule {

    @Binds
    fun bindExternalDataSource(dataSource: ExternalDataSourceImpl): ExternalDataSource
}