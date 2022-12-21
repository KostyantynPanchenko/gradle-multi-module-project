plugins {
    `java-library`
}

java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    api(project(":model"))
    implementation("org.springframework.boot:spring-boot-starter:2.7.6")
}
