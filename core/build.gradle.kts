plugins{
    `java-gradle-plugin`
    `maven-publish`
    id("com.tmsolution.plugins.kotlin") version "0.0.1-SNAPSHOT"
}

dependencies{
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.0")
    implementation("net.researchgate:gradle-release:3.0.2")
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