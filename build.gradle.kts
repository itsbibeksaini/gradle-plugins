plugins {
//    kotlin("jvm") version "1.7.10"
    id("com.tmsolution.plugins.core") version "0.0.1-SNAPSHOT"
    id("com.tmsolution.plugins.kotlin") version "0.0.1-SNAPSHOT"
}

subprojects{

    group = "com.tmsolution.plugins"
    apply{
        plugin("com.tmsolution.plugins.kotlin")
    }

    afterEvaluate {
        dependencyManagement{

        }
    }
}