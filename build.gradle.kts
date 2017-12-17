import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.anies.try"
version = "1.0-SNAPSHOT"

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.10"

    repositories {
        mavenCentral()
    }
    
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
    
}

apply {
    plugin("kotlin")
}

val kotlin_version: String by extra

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compile(kotlinModule("stdlib-jdk8", kotlin_version))
    compile("me.lazmaid.kraph:kraph:0.6.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

