plugins {
    id("java")
    application
    checkstyle
}

group = "my.group"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.34")
    implementation("org.apache.commons:commons-lang3:3.15.0")
    implementation("org.assertj:assertj-core:3.26.3")
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.26.3")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "tests.Test1"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
