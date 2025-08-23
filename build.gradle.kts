plugins {
  application
  java
  kotlin("jvm") version "2.0.0"
}

java {
  toolchain { languageVersion.set(JavaLanguageVersion.of(21)) } // use 17 if you prefer
}

kotlin {
  jvmToolchain(21)
}

application {
  mainClass.set("com.codingdestination.MainKt")
}

repositories { mavenCentral() }

dependencies {
  testImplementation(platform("org.junit:junit-bom:5.10.2"))
  testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test { useJUnitPlatform() 

}
