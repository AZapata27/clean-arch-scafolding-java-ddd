group = "com.example.entrypoints"

dependencies {
    implementation(project(":domain"))
    implementation(project(":infrastructure"))
    implementation("org.springframework.boot:spring-boot-starter")
}

springBoot {
    mainClass.set("com.example.entrypoints.EntrypointsApplication")
}

tasks.bootJar {
    destinationDirectory.set(rootProject.layout.buildDirectory)
}