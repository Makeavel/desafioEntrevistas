package com.api.simplify.controller;

import com.api.simplify.dto.AtribuicaoDTO;
import com.api.simplify.service.AtribuicaoService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("apiAtb")
@RequiredArgsConstructor
public class AtribuicaoController {

      private final AtribuicaoService service;

      @GetMapping("/getAll")
      public ResponseEntity<List<AtribuicaoDTO>> getAtribuiALl(){
          try{
              return ResponseEntity.status(HttpStatus.OK).body(service.getAtribuiAll());
          }catch (IllegalArgumentException e){
              return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
          }
      }

      @GetMapping("/getByIdAtd/{idSuporte}")
      public ResponseEntity<AtribuicaoDTO> getByIdAtribuicao(@PathVariable("idSuporte") UUID idSuporte){
          try{
              return ResponseEntity.status(HttpStatus.OK).body(service.getByIdAtribuicao(idSuporte));
          }catch (IllegalArgumentException e){
              return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
          }
      }

      @PostMapping("/postAtribuicao/{idAtendente}/{idTarefa}")
      public ResponseEntity<AtribuicaoDTO> postAtribuicao(@PathVariable("idAtendente") Integer idAtendente, @PathVariable("idTarefa") Integer idTarefa){
          try{
              return ResponseEntity.status(HttpStatus.OK).body(service.postAtribuicao(idAtendente, idTarefa));
          }catch (IllegalArgumentException e){
              return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
          }
      }

}
