
plugins {
    id("java-library")
}

apply(from = "../gradle/kotlin.gradle")
apply(from = "../gradle/publish.gradle")
apply(from = "../gradle/dokka.gradle")
apply(from = "../gradle/native.gradle")

description = "Hexagon serialization module."

dependencies {
    "api"(project(":core"))

    "testImplementation"(project(":serialization_jackson_json"))
}
