package com.api.simplify.dto;

import com.api.simplify.model.Atendente;
import com.api.simplify.model.Tarefa;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Optional;

@Data
@RequiredArgsConstructor
public class AtendenteDTO {


    private String nome;
    private Integer id;
    //private List<Tarefa> tarefas;

    public AtendenteDTO atendenteDTO (Optional<Atendente> atendente){
        //BeanUtils.copyProperties(atendente,AtendenteDTO.this);
        BeanUtils.copyProperties(atendente,AtendenteDTO.this, "id");
        return this;
    }

    public AtendenteDTO PostatendenteDTO (Atendente atendente){
        BeanUtils.copyProperties(atendente,AtendenteDTO.this);
        //BeanUtils.copyProperties(atendente,AtendenteDTO.this, "id");
        return this;
    }
}
