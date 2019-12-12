/**
 * Created by Dmitrii on 11.12.2019
 *
 */
import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.ScriptHandlerScope
import org.gradle.kotlin.dsl.dependencies

private const val mavenBaseUrl = "https://mvnrepository.com"

fun Project.applyCommonAndroidLibraries() {
    dependencies {
        implementation(Libraries.rxKotlin)
        implementation(Libraries.rxAndroid)

        implementation(Libraries.timber)

        implementation(Libraries.kotlinStdlib)
        implementation(Libraries.kotlinReflect)

        implementation(Libraries.dagger)
        kapt(Libraries.daggerCompiler)
        implementation(Libraries.daggerAndroid)
        implementation(Libraries.daggerAndroidSupport)
        kapt(Libraries.daggerAndroidProcessor)

        implementation(SupportLibraries.appCompat)

        testImplementation(TestLibraries.kotlinMockito)
        testImplementation(TestLibraries.junit)
    }
}

fun Project.applyTestLibraries() {
    dependencies {
        testImplementation(TestLibraries.kotlinMockito)
        testImplementation(TestLibraries.junit)
    }
}

fun applyMainRepositories(handler: RepositoryHandler) = with(handler) {
    maven {
        setUrl("$mavenBaseUrl/artifact/")
    }
    jcenter()
    google()
}
private fun DependencyHandler.implementation(dependencyNotation: Any): Dependency? =
    add("implementation", dependencyNotation)

private fun DependencyHandler.kapt(dependencyNotation: Any): Dependency? =
    add("kapt", dependencyNotation)

private fun DependencyHandler.testImplementation(dependencyNotation: Any): Dependency? =
    add("testImplementation", dependencyNotation)