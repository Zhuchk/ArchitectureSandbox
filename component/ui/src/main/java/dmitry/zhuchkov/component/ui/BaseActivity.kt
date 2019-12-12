package dmitry.zhuchkov.component.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector

/**
 * Created by Dmitrii on 11.12.2019
 *
 */
abstract class BaseActivity: AppCompatActivity(), HasAndroidInjector {

    abstract var androidInjector: DispatchingAndroidInjector<Any>

    open var contentLayout: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(contentLayout)
    }

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector
}