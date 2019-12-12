package dmitry.zhuchkov.feature.main.presentation

import dmitry.zhuchkov.component.mvp.MVPPresenter
import javax.inject.Inject

/**
 * Created by Dmitrii on 12.12.2019
 *
 */
class MainPresenter @Inject constructor() : MVPPresenter<MainView>() {

    fun onMvvmExampleClicked() = Unit

    fun onBottomNavigationExampleClicked() = Unit

    fun onDrawerNavigationExampleClicked() = Unit

    fun onDynamicFeatureExampleClicked() = Unit

    fun onLanguageChangeExampleClicked() = Unit

    fun onErrorHandlingExampleClicked() = Unit

    fun onEDesignSystemExampleClicked() = Unit
}