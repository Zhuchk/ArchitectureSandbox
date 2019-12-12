package dmitrii.zhuchkov.sandbox.navigation.feature

import dmitrii.zhuchkov.sandbox.navigation.ToMainScreenEvent
import dmitry.zhuchkov.component.navigation.NavigationEventProvider
import dmitry.zhuchkov.feature.splash.navigation.SplashRouter
import javax.inject.Inject

/**
 * Created by Dmitrii on 14.12.2019
 *
 */
class SplashRouterImpl @Inject constructor(
    private val navigationEventProvider: NavigationEventProvider
) : SplashRouter {

    override fun openMainScreen() {
        navigationEventProvider.navigationEvent.value = ToMainScreenEvent()
    }
}