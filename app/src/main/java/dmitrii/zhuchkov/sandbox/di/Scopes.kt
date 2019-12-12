package dmitrii.zhuchkov.sandbox.di

import javax.inject.Scope

/**
 * Created by Dmitrii on 11.12.2019
 *
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScope