plugins{
    `java-gradle-plugin`
    `maven-publish`
}

dependencies{
    implementation("com.tmsolution.plugins.core:com.tmsolution.plugins.core.gradle.plugin:0.0.1-SNAPSHOT")
}


gradlePlugin{

    isAutomatedPublishing = true

    plugins{
        create("kotlin"){
            id = "com.tmsolution.plugins.kotlin"
            implementationClass = "com.tmsolution.plugins.kotlin.KotlinPlugin"
        }
    }
}