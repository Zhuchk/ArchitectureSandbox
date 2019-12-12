package dmitry.zhuchkov.component.ui

import android.content.Context
import android.view.inputmethod.InputMethodManager

/**
 * Created by Dmitrii on 12.12.2019
 *
 */
val Context.inputMethodManager
    get() = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager?