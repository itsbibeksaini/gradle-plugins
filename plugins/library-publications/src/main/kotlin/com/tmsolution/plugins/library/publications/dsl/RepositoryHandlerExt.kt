package com.tmsolution.plugins.library.publications.dsl

import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import java.net.URI

fun RepositoryHandler.mavenPublisher(): MavenArtifactRepository{
    return maven {
        it.name = ""
        it.url = URI.create("")
        it.credentials {cred ->
            cred.username = ""
            cred.password = ""
        }
    }
}