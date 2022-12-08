package com.tmsolution.plugins.core

import com.tmsolution.plugins.core.abstract.AbstractPlugin
import com.tmsolution.plugins.core.constants.Plugins
import com.tmsolution.plugins.core.dsl.applyDefaults
import org.gradle.api.Project

class CorePlugin : AbstractPlugin() {

    override val includedPlugins: List<String> = listOf(
        Plugins.RELEASE,
        Plugins.SPOTLESS
    )


    override val configure: Project.() -> Unit = {
        subprojects { project ->
            project.applyDefaults()
        }

    }

}