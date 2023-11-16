pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "spring-multi-module"

// library
include("lib-common")
project(":lib-common").projectDir = file("library/lib-common")
include("lib-context")
project(":lib-context").projectDir = file("library/lib-context")

// platform
include("platform-target")
project(":platform-target").projectDir = file("platform/platform-target")
include("platform-adapter")
project(":platform-adapter").projectDir = file("platform/platform-adapter")

// service
include("service-order")
project(":service-order").projectDir = file("service/service-order")
include("service-pay")
project(":service-pay").projectDir = file("service/service-pay")

// app
include("app-api")
project(":app-api").projectDir = file("app/app-api")
include("app-worker")
project(":app-worker").projectDir = file("app/app-worker")
include("app-batch")
project(":app-batch").projectDir = file("app/app-batch")
