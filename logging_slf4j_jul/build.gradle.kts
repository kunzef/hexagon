
plugins {
    id("java-library")
}

apply(from = "../gradle/kotlin.gradle")
apply(from = "../gradle/publish.gradle")
apply(from = "../gradle/dokka.gradle")
apply(from = "../gradle/native.gradle")

description = "Hexagon SLF4J logging adapter (using JUL as SLF4J engine)."

dependencies {
    val slf4jVersion = properties["slf4jVersion"]

    "api"(project(":logging_jul"))
    "api"("org.slf4j:slf4j-jdk14:$slf4jVersion")
    "api"("org.slf4j:jcl-over-slf4j:$slf4jVersion")
    "api"("org.slf4j:log4j-over-slf4j:$slf4jVersion")
}
