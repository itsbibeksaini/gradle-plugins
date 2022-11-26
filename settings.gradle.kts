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
        maven("https://maven.pkg.github.com/itsbibeksaini/gradle-plugins") {
            credentials {
                username = "madhead"
                password = "<token>"
            }
        }
    }
}

rootProject.name = "gradle-plugins"
include(":plugins:core")
include(":plugins:jvm")
include(":plugins:kotlin")

//include(":plugins:library-publications")
//include(":plugins:csharp")
//include(":plugins:npm")
//include(":plugins:spring")
//include(":plugins:ktor")
