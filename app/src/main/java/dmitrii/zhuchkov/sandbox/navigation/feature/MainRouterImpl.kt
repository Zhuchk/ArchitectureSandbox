package dmitrii.zhuchkov.sandbox.navigation.feature

import dmitrii.zhuchkov.sandbox.navigation.ToMvvmFeatureEvent
import dmitry.zhuchkov.component.navigation.NavigationEventProvider
import dmitry.zhuchkov.feature.main.navigation.MainRouter
import javax.inject.Inject

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
class MainRouterImpl @Inject constructor(
    private val navigationEventProvider: NavigationEventProvider
) : MainRouter {

    override fun openMvvmFeature() {
        navigationEventProvider.navigationEvent.value = ToMvvmFeatureEvent()
    }

}