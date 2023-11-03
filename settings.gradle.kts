pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "spring-multi-module-template"

// service
include("service-order")
project(":service-order").projectDir = file("service/service-order")

// app
include("app-api")
project(":app-api").projectDir = file("app/app-api")
include("app-worker")
project(":app-worker").projectDir = file("app/app-worker")
include("app-batch")
project(":app-batch").projectDir = file("app/app-batch")
