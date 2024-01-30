package com.api.simplify.dto;

import com.api.simplify.model.Atendente;
import com.api.simplify.model.Tarefa;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;

@Data
@RequiredArgsConstructor
public class TarefaDTO {

    private Integer id;
    private String nome;
    private String descricao;
    private Boolean realizado;
    private Boolean prioridade;
    //private Atendente atendente;


    public TarefaDTO tarefasDTO(Tarefa tarefa){
        BeanUtils.copyProperties(tarefa, TarefaDTO.this);
        return this;
    }

}
