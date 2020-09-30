rootProject.name = "Sandbox"

include(
    ":app",
    ":component.mvp",
    ":component.ui",
    ":component.utils",
    ":component.navigation",
    ":component.dagger",
    ":feature.main",
    ":feature.mvvm",
    ":feature.splash"
)

project(":component.mvp").projectDir = File("component/mvp")
project(":component.ui").projectDir = File("component/ui")
project(":component.utils").projectDir = File("component/utils")
project(":component.navigation").projectDir = File("component/navigation")
project(":component.dagger").projectDir = File("component/dagger")
project(":feature.main").projectDir = File("feature/main")
project(":feature.mvvm").projectDir = File("feature/mvvm")
project(":feature.splash").projectDir = File("feature/splash")