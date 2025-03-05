plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":resume-creator-logic-domain"))
    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
    }
}

application {
    mainClass = "resume.creator.logic.infrastruction.App"
}
