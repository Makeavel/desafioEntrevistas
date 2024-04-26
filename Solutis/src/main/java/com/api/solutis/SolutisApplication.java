package com.api.solutis;

import com.api.solutis.dto.SolutisDTO;
import com.api.solutis.model.SolutisModel;
import com.api.solutis.service.SolutisService;
import com.api.solutis.service.SolutisServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SolutisApplication {

   private final SolutisService service;

    public static void main(String[] args) {

        SpringApplication.run(SolutisApplication.class, args);

    }


}
