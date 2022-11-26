plugins {
//    kotlin("jvm") version "1.7.10"
    `maven-publish`
    id("com.tmsolution.plugins.core") version "0.0.1-SNAPSHOT"
    id("com.tmsolution.plugins.kotlin") version "0.0.1-SNAPSHOT"
}

subprojects{

    group = "com.tmsolution.plugins"
    apply{
        plugin("com.tmsolution.plugins.kotlin")
        apply(plugin = "maven-publish")
//        plugin("kotlin")
    }

    configure<PublishingExtension>{
        repositories {
                maven{
                    name = "GitHubPackages"
                    url = uri("https://maven.pkg.github.com/itsbibeksaini/gradle-plugins")
                    credentials{
                        username = "itsbibeksaini"
                        password = "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"
                    }
                }
            }

            publications{
                register<MavenPublication>("gpr"){
                    from(components["java"])
                }
            }
    }

    afterEvaluate {
        dependencyManagement{

        }
    }
}