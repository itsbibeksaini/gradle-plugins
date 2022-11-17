package com.tmsolution.plugins.core.abstract

import com.tmsolution.plugins.core.dsl.applyDefaults
import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class AbstractPlugin : Plugin<Project> {

    protected open val includedPlugins:List<String> = listOf()

    protected abstract val configure: Project.() -> Unit

    override fun apply(target: Project) = target.run {
        applyDefaults()
        includedPlugins.forEach(pluginManager::apply)
        configure(this)
    }
}