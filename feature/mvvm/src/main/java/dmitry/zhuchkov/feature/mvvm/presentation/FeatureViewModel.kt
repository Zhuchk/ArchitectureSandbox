package dmitry.zhuchkov.feature.mvvm.presentation

import androidx.lifecycle.MutableLiveData
import dmitry.zhuchkov.feature.mvvm.domain.usecase.GetScreenTextUseCase
import dmitry.zhuchkov.feature.mvvm.navigation.FeatureRouter
import javax.inject.Inject

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
class FeatureViewModel @Inject constructor(
    private val router: FeatureRouter,
    private val useCase: GetScreenTextUseCase

) {
    val viewState = MutableLiveData<FeatureViewState>()

    fun loadScreenText() {
        viewState.postValue(FeatureViewState(useCase()))
    }

    fun navigateBack() {
        router.back()
    }
}