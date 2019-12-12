plugins {
    `kotlin-dsl`
}

val mavenBaseUrl = "https://mvnrepository.com"

repositories {
    maven {
        setUrl("$mavenBaseUrl/artifact/")
    }
    maven {
        setUrl("$mavenBaseUrl/artifact/android")
    }
    maven {
        setUrl("$mavenBaseUrl/artifact/maven2")
    }
    google()
    jcenter()
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:3.5.3")
}