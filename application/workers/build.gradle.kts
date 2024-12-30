group = "com.example.workers"

dependencies {
    implementation(project(":domain"))
    implementation(project(":infrastructure"))
    implementation("org.springframework.boot:spring-boot-starter")
}

springBoot {
    mainClass.set("com.example.workers.WorkersApplication")
}

tasks.bootJar {
    destinationDirectory.set(rootProject.layout.buildDirectory)
}