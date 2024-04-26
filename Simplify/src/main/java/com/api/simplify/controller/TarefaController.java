package com.api.simplify.controller;

import com.api.simplify.dto.TarefaDTO;
import com.api.simplify.model.Tarefa;
import com.api.simplify.service.TarefaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiTrf")
@RequiredArgsConstructor
public class TarefaController {

    private final TarefaService service;

   @GetMapping("/getAll")
    public ResponseEntity<List<TarefaDTO>> getAllTarefas(){
       try{
           return ResponseEntity.status(HttpStatus.OK).body(service.getAllTarefas());
       }catch (IllegalArgumentException e){
           return ResponseEntity.notFound().build();
       }
   }

   @GetMapping("/getById/{idTarefa}")
   public ResponseEntity<TarefaDTO> getTarefaById(@PathVariable("idTarefa")Integer idTarefa){
       try{
           return ResponseEntity.status(HttpStatus.OK).body(service.getTarefaById(idTarefa));
       }catch (IllegalArgumentException e){
           return ResponseEntity.notFound().build();
       }
   }

   @PostMapping("/post")
    public ResponseEntity<TarefaDTO> postTarefas(@RequestBody Tarefa tarefa){
       try{
           return ResponseEntity.status(HttpStatus.OK).body(service.postTarefas(tarefa));
       }catch (IllegalArgumentException e){
           return ResponseEntity.notFound().build();
       }
   }

   @DeleteMapping("/deleteById/{idTarefa}")
    public ResponseEntity<String> deleteTarefa(@PathVariable("idTarefa") Integer idTarefa){
       try{
           return ResponseEntity.status(HttpStatus.OK).body(service.deleteTarefa(idTarefa));
       }catch (IllegalArgumentException e){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error na operação");
       }
   }



}
