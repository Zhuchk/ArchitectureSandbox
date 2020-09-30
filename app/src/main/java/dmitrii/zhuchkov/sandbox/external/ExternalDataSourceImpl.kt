package dmitrii.zhuchkov.sandbox.external

import dmitry.zhuchkov.feature.mvvm.data.datasource.ExternalDataSource
import javax.inject.Inject

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
//TODO: move to another module from app
class ExternalDataSourceImpl @Inject constructor() : ExternalDataSource {

    override fun getSomeText(): String =
        "A B C D from app"

}