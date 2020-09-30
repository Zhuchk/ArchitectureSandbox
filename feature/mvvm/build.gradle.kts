android {
    compileSdkVersion(ApplicationId.maxApi)
    buildToolsVersion(ApplicationId.tools)

    defaultConfig {
        minSdkVersion(ApplicationId.minApi)
        targetSdkVersion(ApplicationId.maxApi)
        versionCode = ApplicationId.versionCode
        versionName = ApplicationId.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments(mapOf("clearPackageData" to "true"))
    }
}

dependencies {
    implementation(project((":component.ui")))
    implementation(project((":component.navigation")))
    implementation(project((":component.dagger")))

    implementation(Libraries.rxKotlin)
    implementation(Libraries.rxAndroid)

    implementation(Libraries.kotlinStdlib)
    implementation(Libraries.kotlinReflect)

    implementation(Libraries.dagger)
    implementation(Libraries.daggerAndroid)
    implementation(Libraries.daggerAndroidSupport)
    kapt(Libraries.daggerCompiler)
    kapt(Libraries.daggerAndroidProcessor)
}