package dmitrii.zhuchkov.sandbox.navigation

import android.os.Bundle
import androidx.navigation.NavDirections
import dmitrii.zhuchkov.sandbox.R
import dmitry.zhuchkov.component.navigation.NavigationEvent

/**
 * Created by Dmitrii on 12.12.2019
 *
 */
class ToMainScreenEvent : NavigationEvent, NavDirections {
    override fun getArguments(): Bundle =
        Bundle()

    override fun getActionId(): Int =
        R.id.action_splashFragment_to_mainFragment
}

class ToMvvmFeatureEvent : NavigationEvent, NavDirections {
    override fun getArguments(): Bundle =
        Bundle()

    override fun getActionId(): Int =
        R.id.action_mainFragment_to_mvvmFragment
}
