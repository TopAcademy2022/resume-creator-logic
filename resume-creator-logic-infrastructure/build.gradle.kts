plugins {
    id("maven-publish")
}

group = "top.resume.creator"
version = "0.5-SNAPSHOT"

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }

    repositories {
        mavenLocal()
    }
}

dependencies {
    implementation(project(":resume-creator-logic-domain"))

    implementation("org.hibernate:hibernate-core:6.3.1.Final")
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")

    implementation("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    api("org.xerial:sqlite-jdbc:3.45.1.0")
    api("org.hibernate:hibernate-community-dialects:6.6.3.Final")
}
