package com.tmsolution.plugins.core.dsl

import com.tmsolution.plugins.core.constants.Plugins
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.testing.Test
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.applyDefaults(): Project{

    listOf(
        Plugins.BASE,
        Plugins.SPRING_DEPENDENCY_MANAGEMENT
    ).forEach(pluginManager::apply)

    repositories.apply {
        mavenCentral()
    }

    afterEvaluate {
        tasks.withType(Test::class.java){
            it.useJUnitPlatform()
        }
    }

    return this
}

public fun Project.applyJvmDefaults():Project {

    extensions.configure(JavaPluginExtension::class.java) {
        it.targetCompatibility = JavaVersion.VERSION_17
        it.sourceCompatibility = JavaVersion.VERSION_17
    }

    return this
}

fun Project.applyKotlinDefaults(): Project{

    listOf(
        Plugins.KOTLIN_JVM
    ).forEach(pluginManager::apply)

    tasks.withType(KotlinCompile::class.java) {
        it.kotlinOptions {
            freeCompilerArgs = listOf(
                "-Xjsr305=strict",
                "-opt-in=kotlin.RequiresOptIn"
            )
            jvmTarget = "17"
        }
    }

    return this
}