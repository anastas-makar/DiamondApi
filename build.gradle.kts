plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm") version "1.9.0"
}

repositories {
    mavenCentral()  // Указываем Maven Central
    // jcenter()  // Если необходимо, можно добавить jcenter
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")  // для корутин
}