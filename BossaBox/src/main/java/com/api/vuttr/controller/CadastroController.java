package com.api.vuttr.controller;

import com.api.vuttr.dto.CadastroDTO;
import com.api.vuttr.model.Cadastros;
import com.api.vuttr.service.CadastroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "/api")
@RequiredArgsConstructor
public class CadastroController {

    private final CadastroService cService;

    //Get - Todos Registros
    @Operation(summary = "Busca os dados de todos os cadastros", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @GetMapping("/getAllRegisters")
    public ResponseEntity<List<CadastroDTO>> getAllRegistros(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(cService.getAllRegistros());
        }catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //Get - Busca Registro por Nome
    @Operation(summary = "Busca os dados de todos os cadastros", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @GetMapping("/getRegisterName")
    public ResponseEntity<List<CadastroDTO>> getRegisterName(@RequestParam String name){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(cService.getRegisterName(name));
        }catch (IllegalArgumentException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //Get - Busca Registro por Tag
    @Operation(summary = "Busca os dados de todos os cadastros", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @GetMapping("/getRegisterTag")
    public ResponseEntity<List<CadastroDTO>> getRegister(@RequestParam String tags){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(cService.getRegisterTags(tags));
        }catch (IllegalArgumentException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // Post - Add Registro
    @Operation(summary = "Realiza um novo cadastro", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Cadastro realizado com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar o cadastro"),
    })
    @PostMapping("/postRegistro")
    public ResponseEntity<CadastroDTO> postRegistro(@RequestBody Cadastros cadastros){
        try {
            CadastroDTO save = cService.postRegistro(cadastros);
            return new ResponseEntity<>(save, HttpStatus.CREATED);
        }catch(IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
