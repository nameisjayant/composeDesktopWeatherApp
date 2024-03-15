import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

group = "com.nameisjayant"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation("io.ktor:ktor-client-cio:${project.properties["ktor_client.version"]}")
    implementation("io.ktor:ktor-client-gson:${project.properties["ktor_client.version"]}")
    implementation ("io.insert-koin:koin-core:${project.properties["koin.version"]}")
    testImplementation ( "io.insert-koin:koin-test:${project.properties["koin.version"]}")
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "demo1"
            packageVersion = "1.0.0"
        }
    }
}
