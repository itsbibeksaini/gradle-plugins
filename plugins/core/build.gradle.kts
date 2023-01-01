plugins{
    `java-gradle-plugin`
    `maven-publish`
}

dependencies{

}

gradlePlugin{

    isAutomatedPublishing = true

    plugins {
        create("core"){
            id = "com.tmsolution.plugins.core"
            implementationClass = "com.tmsolution.plugins.core.CorePlugin"
        }
    }
}