plugins {
    kotlin("jvm") version "1.4.32"
    kotlin("plugin.allopen") version "1.4.32"
    id("io.quarkus") version "2.0.0.Final"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {

    implementation(enforcedPlatform("io.quarkus:quarkus-universe-bom:2.0.0.Final"))

    implementation("io.quarkus:quarkus-hibernate-orm-panache-kotlin")
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy-jackson")
    runtimeOnly("io.quarkus:quarkus-config-yaml")
    runtimeOnly("io.quarkus:quarkus-jdbc-mysql")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

allOpen {
    annotation("io.quarkus.test.junit.QuarkusTest")
    annotation("javax.enterprise.context.ApplicationScoped")
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.Embeddable")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.ws.rs.Path")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
        javaParameters = true
    }
}
