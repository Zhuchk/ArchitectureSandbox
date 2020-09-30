package dmitry.zhuchkov.feature.mvvm.data.repository

import dmitry.zhuchkov.feature.mvvm.data.datasource.ExternalDataSource
import dmitry.zhuchkov.feature.mvvm.domain.repository.ScreenTextRepository
import javax.inject.Inject

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
internal class ScreenTextRepositoryImpl @Inject constructor(
    private val externalDataSource: ExternalDataSource
) : ScreenTextRepository {

    override fun get(): String =
        externalDataSource.getSomeText()

}