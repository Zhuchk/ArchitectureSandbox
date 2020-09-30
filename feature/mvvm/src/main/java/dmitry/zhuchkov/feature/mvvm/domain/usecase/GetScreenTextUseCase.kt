package dmitry.zhuchkov.feature.mvvm.domain.usecase

import dmitry.zhuchkov.feature.mvvm.domain.repository.ScreenTextRepository
import javax.inject.Inject

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
class GetScreenTextUseCase @Inject constructor(
    private val repository: ScreenTextRepository
) {

    operator fun invoke(): String =
        repository.get()
}