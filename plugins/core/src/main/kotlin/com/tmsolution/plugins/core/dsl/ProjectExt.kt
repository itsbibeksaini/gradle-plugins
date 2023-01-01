package com.tmsolution.plugins.core.dsl

import com.tmsolution.plugins.core.constants.Plugins
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test

fun Project.applyDefaults(): Project{

    listOf(
        Plugins.BASE,
        Plugins.SPRING_DEPENDENCY_MANAGEMENT,
        Plugins.IDEA
    ).forEach(pluginManager::apply)

    repositories.apply {
        mavenCentral()
    }

    afterEvaluate {
        tasks.withType(Test::class.java){
            it.useJUnitPlatform()
        }
    }

    return this;
}