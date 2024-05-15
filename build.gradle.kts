import com.github.softwareplace.springboot.buildconfiguration.applyGraalvm
import com.github.softwareplace.springboot.utils.logstashLogbackEncoderVersion
import com.github.softwareplace.springboot.utils.mapStruct
import com.github.softwareplace.springboot.utils.springBootStartWeb
import com.github.softwareplace.springboot.utils.springJettyApi

plugins {
    id("com.github.softwareplace.springboot.kotlin")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

applyGraalvm()

dependencies {
//    testImplementation("org.springframework.boot:spring-boot-starter-test") {
//        exclude(group = "org.springframework.boot", module = "spring-boot-starter-logging")
//    }
    springJettyApi()
    mapStruct()
    springBootStartWeb()
    logstashLogbackEncoderVersion()

}
