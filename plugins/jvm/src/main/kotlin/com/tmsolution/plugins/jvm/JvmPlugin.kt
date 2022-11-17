package com.tmsolution.plugins.jvm

import com.tmsolution.plugins.core.abstract.AbstractPlugin
import com.tmsolution.plugins.core.dsl.applyJvmDefaults


import org.gradle.api.Project

class JvmPlugin : AbstractPlugin() {

    override val includedPlugins: List<String> = listOf()


    override val configure: Project.() -> Unit = {
        applyJvmDefaults()
    }


}