package dmitry.zhuchkov.feature.main.presentation

import dmitry.zhuchkov.component.mvp.MVPPresenter
import dmitry.zhuchkov.feature.main.navigation.MainRouter
import javax.inject.Inject

/**
 * Created by Dmitrii on 12.12.2019
 *
 */
class MainPresenter @Inject constructor(
    private val router: MainRouter
) : MVPPresenter<MainView>() {

    fun onMvvmExampleClicked() {
        router.openMvvmFeature()
    }

    fun onBottomNavigationExampleClicked() = Unit

    fun onDrawerNavigationExampleClicked() = Unit

    fun onDynamicFeatureExampleClicked() = Unit

    fun onLanguageChangeExampleClicked() = Unit

    fun onErrorHandlingExampleClicked() = Unit

    fun onEDesignSystemExampleClicked() = Unit
}