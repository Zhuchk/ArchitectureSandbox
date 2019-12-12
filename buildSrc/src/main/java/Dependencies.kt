object ApplicationId {
	val id = "dmitrii.zhuchkov.sandbox"
	val minApi = 21
	val maxApi = 28
	val tools = "28.0.3"
	val versionCode = 1
	val versionName = "1.0.0"
}

object Versions {
	val gradle = "3.4.2"
	val kotlin = "1.3.41"

	// Android
	val appCompatVersion = "1.0.2"
	val recyclerViewVersion = "1.0.0"
	val legacySupportVersion = "1.0.0"
	val materialVersion = "1.1.0-alpha05"
	val coreUIVersion = "1.0.0"
	val cardViewVersion = "1.0.0"
	val annotationVersion = "1.0.0"
	val browserVersion = "1.0.0"
	val coreKtxVersion = "1.1.0"
	val multidex = "2.0.1"
	val navVersion = "2.1.0"

	// Arch
	const val roomVersion = "2.0.0"
	const val lifecycleVersion = "2.0.0"
	const val support = "26.1.0"
	const val arch = "1.0.0"

	// Rx
	val rxKotlin = "2.1.0"
	val rxAndroid = "2.0.1"

	// Dagger
	val dagger = "2.25.2"

	// Networking
	val retrofit2 = "2.3.0"
	val okHttp = "3.11.0"
	val gson = "2.8.2"

	// Logging
	val timber = "4.6.1"

	// Testing
	val espresso = "3.1.1"
	val kotlinMockito = "1.6.0"
	val junit = "4.12"
	val junitExtVersion = "1.1.0"
	val androidMockito = "2.18.3"
	val junitJacoco = "0.8.3"
	val testRunner = "1.1.1"
	val barista = "2.7.0"
	val uiautomator = "2.1.3"

	val dataBinding = "3.3.2"
	val constraintLayout = "1.1.3"

	// Other
	val stetho = "1.5.1"
	val leakCanary = "1.6.3"

	// Glide
	val glide = "4.10.0"
}

object Classpaths {
	val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
	val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
	val kotlinAndroidExtensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
}

object Libraries {
	val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
	val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

	// Rx
	val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
	val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"

	// Dagger
	val dagger = "com.google.dagger:dagger:${Versions.dagger}"
	val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
	val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
	val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
	val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

	// Retrofit
	val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit2}"
	val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit2}"
	val retrofitAdapterRxJava = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit2}"

	// OkHttp
	val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
	val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
	val okhttpUrlconnection = "com.squareup.okhttp3:okhttp-urlconnection:${Versions.okHttp}"

	val timber = "com.jakewharton.timber:timber:${Versions.timber}"
	val gson = "com.google.code.gson:gson:${Versions.gson}"

	// Google
	val databindingCompiler = "androidx.databinding:databinding-compiler:${Versions.dataBinding}"

	// Arch
	val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
	val roomRx = "androidx.room:room-rxjava2:${Versions.roomVersion}"
	val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
	val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"

	// Stetho
	val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
	val stethoOkHttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"

	// Leak Canary
	val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
	val leakCanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakCanary}"
	val leakCanarySupport = "com.squareup.leakcanary:leakcanary-support-fragment:${Versions.leakCanary}"

	// Glide
	val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
	val glideAnnotationProcessor = "com.github.bumptech.glide:compiler:${Versions.glide}"
}

object SupportLibraries {
	val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
	val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"
	val supportV4 = "androidx.legacy:legacy-support-v4:${Versions.legacySupportVersion}"
	val material = "com.google.android.material:material:${Versions.materialVersion}"
	val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
	val coreUI = "androidx.legacy:legacy-support-core-ui:${Versions.coreUIVersion}"
	val cardView = "androidx.cardview:cardview:${Versions.cardViewVersion}"
	val supportAnnotations = "androidx.annotation:annotation:${Versions.annotationVersion}"
	val browser = "androidx.browser:browser:${Versions.browserVersion}"
	val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
	val multidex = "androidx.multidex:multidex:${Versions.multidex}"

	val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navVersion}"
	val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
}

object TestLibraries {
	val mockito = "org.mockito:mockito-core:${Versions.androidMockito}"
	val mockitoAndroid = "org.mockito:mockito-android:${Versions.androidMockito}"
	val junit = "junit:junit:${Versions.junit}"
	val junitExt = "androidx.test.ext:junit:${Versions.junitExtVersion}"
	val kotlinMockito = "com.nhaarman:mockito-kotlin-kt1.1:${Versions.kotlinMockito}"
	val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
	val espressoIntents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"
	val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
	val espressoIdling = "androidx.test.espresso.idling:idling-concurrent:${Versions.espresso}"
	val espressoWeb = "androidx.test.espresso:espresso-web:${Versions.espresso}"
	val barista = "com.schibsted.spain:barista:${Versions.barista}"
	val uiAutomator = "com.android.support.test.uiautomator:uiautomator-v18:${Versions.uiautomator}"
	val orchestrator = "androidx.test:orchestrator:${Versions.testRunner}"

	val roomTesting = "androidx.room:room-testing:${Versions.roomVersion}"
}

object ArchitectureLibraries {
	const val lifecycleExt = "android.arch.lifecycle:extensions:${Versions.arch}"
	const val lifeCycleRunTime = "android.arch.lifecycle:runtime:${Versions.arch}"
	const val lifecycleCompiler = "android.arch.lifecycle:compiler:${Versions.arch}"
	const val roomRT = "android.arch.persistence.room:runtime:${Versions.arch}"
	const val roomRx = "android.arch.persistence.room:rxjava2:${Versions.arch}"
	const val roomCompiler = "android.arch.persistence.room:compiler:${Versions.arch}"
}

