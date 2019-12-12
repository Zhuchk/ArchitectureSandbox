package dmitrii.zhuchkov.sandbox.navigation

import dmitry.zhuchkov.component.navigation.NavigationEvent
import dmitry.zhuchkov.component.navigation.NavigationEventProvider
import dmitry.zhuchkov.component.navigation.Router

/**
 * Created by Dmitrii on 11.12.2019
 *
 */
class RouterImpl(
    private val provider: NavigationEventProvider
): Router {

    override fun navigate(event: NavigationEvent) {
        provider.navigationEvent.value = event
    }
}