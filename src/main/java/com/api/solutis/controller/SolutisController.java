package com.api.solutis.controller;

import com.api.solutis.dto.SolutisDTO;
import com.api.solutis.model.SolutisModel;
import com.api.solutis.service.SolutisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SolutisController {

    private final SolutisService service;

    @PostMapping("/entrada")
    public ResponseEntity<SolutisDTO> postEntrada(@RequestBody SolutisModel solutisModel){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.postEntrada(solutisModel));
        }catch (IllegalArgumentException e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<SolutisDTO>> getAllEntradas(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.getAllEntradas());
        }catch (IllegalArgumentException e){
            return ResponseEntity.notFound().build();
        }
    }

}
