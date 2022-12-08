package com.tmsolution.plugins.library.publications.dsl

import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication

private fun Project.test(){
    extensions.configure(PublishingExtension::class.java){
        it.repositories.apply {
            mavenCentral()
            mavenPublisher()
        }

        it.publications.apply {
            create("maven", MavenPublication::class.java){publications ->
                publications.versionMapping { vm ->
                    vm.usage("java-api") {strategy ->
                        strategy.fromResolutionOf("runtimeClasspath")
                    }

                    vm.usage("java-runtime"){ strategy ->
                        strategy.fromResolutionResult()
                    }

                    publications.pom {pom ->
                        val baseUrl = ""

                        pom.description.set(
                            project.description.takeUnless { it.isNullOrBlank() } ?: rootProject.description
                        )
                    }
                }
            }
        }
    }
}