plugins {
    java
}

tasks.named<Jar>("jar"){
    manifest {
        attributes["Main-Class"] = "dev.mufaddal.marsrover.Main"
    }
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

repositories {
    mavenCentral()
}
