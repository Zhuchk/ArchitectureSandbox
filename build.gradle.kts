import com.android.build.gradle.AppPlugin

plugins {
    base
}

buildscript {
    repositories {
        applyMainRepositories(this)
    }

    dependencies {
        classpath(Classpaths.gradle)
        classpath(kotlin("gradle-plugin", version = Versions.kotlin))
        classpath(Classpaths.kotlinAndroidExtensions)
    }
}

allprojects {
    repositories {
        applyMainRepositories(this)
    }
}

subprojects {
    val isAndroidApp = project.name == "app"

    if (isAndroidApp) {
        apply(plugin = "com.android.application")
        apply<AppPlugin>()
    } else {
        apply(plugin = "com.android.library")
    }

    apply(plugin = "kotlin-android")
    apply(plugin = "kotlin-android-extensions")
    apply(plugin = "kotlin-kapt")

    if (isAndroidApp) {
        applyCommonAndroidLibraries()
    } else {
        applyTestLibraries()
    }
}