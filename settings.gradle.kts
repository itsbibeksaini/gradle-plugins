pluginManagement{
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "gradle-plugins"
include(":plugins:core")
include(":plugins:jvm")
include(":plugins:kotlin")
