package com.api.simplify.controller;

import com.api.simplify.dto.AtendenteDTO;
import com.api.simplify.model.Atendente;
import com.api.simplify.service.AtendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiAtd")
@RequiredArgsConstructor
public class AtendenteController {

    private final AtendenteService service;

    @GetMapping("/getAll")
    public ResponseEntity<List<AtendenteDTO>> getAllAtendentes(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.getAllAtendentes());
        }catch (IllegalArgumentException e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getByID/{idAtendente}")
    public ResponseEntity<AtendenteDTO> getAtendenteById (@PathVariable("idAtendente") Integer id){
        try{
            AtendenteDTO dto = service.getAtententeById(id);
            return ResponseEntity.status(HttpStatus.OK).body(dto);
        }catch (IllegalArgumentException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/post")
    public ResponseEntity<AtendenteDTO> postAtendente (@RequestBody Atendente atendente){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.postAtendente(atendente) );
        }catch (IllegalArgumentException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<AtendenteDTO> putAtendente ( @PathVariable("id") Integer id ,@RequestBody Atendente atendente){
        try{
            //Atendente findAtendente = service.getAtententeById(id);
            return ResponseEntity.status(HttpStatus.OK).body(service.putAtendente(atendente) );
        }catch (IllegalArgumentException e){
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAtendente (@PathVariable("id") Integer id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.deleteAtendente(id));
        }catch (IllegalArgumentException e){
            return ResponseEntity.notFound().build();
        }
    }


}
