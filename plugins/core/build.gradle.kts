plugins{
    `java-gradle-plugin`
    `maven-publish`
}

dependencies{
    implementation("io.spring.gradle:dependency-management-plugin:1.1.0")
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