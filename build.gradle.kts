val ktorVersion = "1.6.7"
val kotlinVersion = "1.4.21"
val logbackVersion = "1.2.10"
val kGraphQLVersion = "0.17.14"
val kMongoVersion = "4.4.0"
val bcryptVersion = "0.9.0"
val kodein = "7.10.0"

plugins {
    application
    kotlin("jvm") version "1.7.10"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}

group = "com.shoppe"
version = "0.0.1"

application {
    mainClassName = "com.adwi.shoppe.ServerKt"
}

tasks.withType<Jar> {
    manifest {
        attributes(
            mapOf(
                "Main-Class" to application.mainClassName
            )
        )
    }
}

tasks.create("stage") {
    dependsOn("installDist")
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    mavenLocal()
    jcenter()
    google()
}

dependencies {
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("io.ktor:ktor-gson:$ktorVersion")
    implementation("io.ktor:ktor-auth:$ktorVersion")
    implementation("io.ktor:ktor-auth-jwt:$ktorVersion")

    implementation("org.kodein.di:kodein-di-framework-ktor-server-jvm:$kodein")

    implementation("org.litote.kmongo:kmongo:$kMongoVersion")
    implementation("com.apurebase:kgraphql:$kGraphQLVersion")
    implementation("com.apurebase:kgraphql-ktor:$kGraphQLVersion")

    implementation("at.favre.lib:bcrypt:$bcryptVersion")

    testImplementation("io.ktor:ktor-server-tests:$ktorVersion")
}

kotlin.sourceSets["main"].kotlin.srcDirs("src")
kotlin.sourceSets["test"].kotlin.srcDirs("test")

sourceSets["main"].resources.srcDirs("resources")
sourceSets["test"].resources.srcDirs("testresources")
