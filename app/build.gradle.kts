import com.android.build.gradle.AppPlugin
import org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper

apply {
    plugin<AppPlugin>()
    plugin<KotlinAndroidPluginWrapper>()
}

android {
    compileSdkVersion(ApplicationId.maxApi)
    buildToolsVersion(ApplicationId.tools)

    defaultConfig {
        applicationId = ApplicationId.id
        minSdkVersion(ApplicationId.minApi)
        targetSdkVersion(ApplicationId.maxApi)
        versionCode = ApplicationId.versionCode
        versionName = ApplicationId.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments(mapOf("clearPackageData" to "true"))
    }

    bundle {

        density {
            enableSplit = true
        }

        abi {
            enableSplit = true
        }

        language {
            enableSplit = false
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(project((":component.mvp")))
    implementation(project((":component.ui")))
    implementation(project((":component.utils")))
    implementation(project((":component.navigation")))
    implementation(project((":component.dagger")))
    implementation(project((":feature.main")))
    implementation(project((":feature.mvvm")))
    implementation(project((":feature.splash")))

    implementation(SupportLibraries.material)
    implementation(SupportLibraries.constraint)
    implementation(SupportLibraries.recyclerView)
    implementation(SupportLibraries.coreKtx)

    implementation(SupportLibraries.navigationFragment)
    implementation(SupportLibraries.navigationUi)

    implementation(ArchitectureLibraries.lifecycleExt)
    implementation(ArchitectureLibraries.lifeCycleRunTime)
    kapt(ArchitectureLibraries.lifecycleCompiler)

    implementation(Libraries.rxKotlin)

    implementation(Libraries.gson)
}