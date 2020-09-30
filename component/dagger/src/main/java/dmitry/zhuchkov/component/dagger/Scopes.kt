package dmitry.zhuchkov.component.dagger

import javax.inject.Scope

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ModuleScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FeatureScope