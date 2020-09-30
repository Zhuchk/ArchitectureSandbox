package dmitry.zhuchkov.feature.mvvm.navigation

import dmitry.zhuchkov.component.navigation.NavigationEventProvider
import dmitry.zhuchkov.component.navigation.NavigationUp
import javax.inject.Inject

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
class FeatureRouter @Inject constructor(
    private val navigationEventProvider: NavigationEventProvider
) {

    fun back() {
        navigationEventProvider.navigationEvent.value = NavigationUp
    }

}