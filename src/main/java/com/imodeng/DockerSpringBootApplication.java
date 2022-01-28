package com.imodeng;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Docker Service API", version = "1.0", description = "Spring Boot with Docker Image"))

public class DockerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringBootApplication.class, args);
    }

}
