package dmitrii.zhuchkov.sandbox.di

import dagger.Module
import dmitrii.zhuchkov.sandbox.external.MvvmFeatureModule

/**
 * Created by Dmitrii on 30.09.2020
 *
 */
@Module(includes = [MvvmFeatureModule::class])
interface FeatureModule