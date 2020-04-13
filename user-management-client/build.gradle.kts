
plugins {
    id("org.springframework.boot")

    kotlin("jvm")
    kotlin("plugin.spring")
    id ("org.jetbrains.kotlin.plugin.jpa")
    id ("com.moowork.node") version "1.3.1"

}

apply {
    plugin ("com.moowork.node")
}

dependencies{
        implementation("org.springframework.boot:spring-boot-starter")
        implementation("org.springframework.boot:spring-boot-starter-web")

    }


