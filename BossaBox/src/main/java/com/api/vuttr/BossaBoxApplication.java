package com.api.vuttr;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "VUTTR(Very Useful Tools to Remember)",version = "1",description = "BossaBox Application"))
public class BossaBoxApplication {

    public static void main(String[] args) {
        SpringApplication.run(BossaBoxApplication.class, args);
    }

}
