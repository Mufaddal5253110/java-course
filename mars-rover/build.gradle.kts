plugins {
    java
}

tasks.named<Jar>("jar"){
    manifest {
        attributes["Main-Class"] = "main.java.dev.mufaddal.marsrover.Main"
    }
}
