plugins {
    id("java-library")
}

group = "top.resume.creator"
version = "0.5-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java-library")

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(23)
        }
    }

    // tasks.withType<JavaCompile> {
    //     sourceCompatibility = "8"
    //     targetCompatibility = "8"
    // }
}