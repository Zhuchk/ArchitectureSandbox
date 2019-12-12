rootProject.name = "Sandbox"

include(
    ":app",
    ":component.mvp",
    ":component.ui",
    ":component.utils",
    ":component.navigation",
    ":feature.main",
    ":feature.splash"
)

project(":component.mvp").projectDir = File("component/mvp")
project(":component.ui").projectDir = File("component/ui")
project(":component.utils").projectDir = File("component/utils")
project(":component.navigation").projectDir = File("component/navigation")
project(":feature.main").projectDir = File("feature/main")
project(":feature.splash").projectDir = File("feature/splash")