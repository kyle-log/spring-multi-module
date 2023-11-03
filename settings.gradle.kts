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
