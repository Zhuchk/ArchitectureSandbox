package dmitry.zhuchkov.component.ui

import android.app.Activity

/**
 * Created by Dmitrii on 12.12.2019
 *
 */
fun Activity.hideSoftKeyboard() {
    val decorView = window.decorView

    inputMethodManager?.apply {
        hideSoftInputFromWindow(decorView.windowToken, 0)
        hideSoftInputFromWindow(decorView.applicationWindowToken, 0)
    }
}