plugins {
    java
    alias(libs.plugins.quarkus)
}

group = "io.fouad"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(libs.quarkus.bom))
    implementation(libs.quarkus.rest.jackson)
    implementation(libs.quarkus.container.image.docker)
    testImplementation(libs.quarkus.junit5)
}

tasks.test {
    useJUnitPlatform()
}

quarkus {
    set("package.jar.enabled", "false")
    set("native.enabled", "true")
    set("native.container-build", "true")
    set("native.container-runtime", "docker")
    set("native.builder-image", libs.versions.quarkusGraalvmceBuilderImage.get())
    set("container-image.build", "true")
}
