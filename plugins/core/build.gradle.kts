plugins{
    `java-gradle-plugin`
    `maven-publish`
}

dependencies{
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
}

gradlePlugin{

    isAutomatedPublishing = true

    plugins{
        create("core"){
            id = "com.tmsolution.plugins.core"
            implementationClass = "com.tmsolution.plugins.core.CorePlugin"
        }
    }
}