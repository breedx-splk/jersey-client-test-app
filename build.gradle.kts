plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    implementation("org.glassfish.jersey.core:jersey-client:2.33")
//    implementation("org.glassfish.jersey.inject:jersey-hk2:2.33")
//    implementation("org.glassfish.jersey.media:jersey-media-json-jackson:2.33")

    implementation("org.glassfish.jersey.core:jersey-client:3.0.0")
    implementation("org.glassfish.jersey.inject:jersey-hk2:3.0.0")
    implementation("org.glassfish.jersey.media:jersey-media-json-jackson:3.0.0")

    testImplementation("junit", "junit", "4.12")
}
