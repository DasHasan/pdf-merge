plugins {
    kotlin("jvm") version "1.4.32"
    application
    distribution
}

group = "de.hasan"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.apache.pdfbox:pdfbox:2.0.22")
}

application {
    mainClass.set("org.example.ApplicationKt")
}

