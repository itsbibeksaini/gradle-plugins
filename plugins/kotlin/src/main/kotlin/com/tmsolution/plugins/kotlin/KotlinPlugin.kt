package com.tmsolution.plugins.kotlin

import com.tmsolution.plugins.core.abstract.AbstractPlugin
import com.tmsolution.plugins.core.constants.Plugins
import com.tmsolution.plugins.core.dsl.applyKotlinDefaults
import org.gradle.api.Project

class KotlinPlugin : AbstractPlugin() {

    override val includedPlugins: List<String> = listOf(
        Plugins.KOTLIN_JVM
    )


    override val configure: Project.() -> Unit = {
        applyKotlinDefaults()
    }

}