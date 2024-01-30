package com.api.simplify.dto;

import com.api.simplify.model.Atendente;
import com.api.simplify.model.AtribuiTarefa;
import com.api.simplify.model.Tarefa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtribuicaoDTO {

    private UUID suporte;
    private Atendente atendente;
    private Tarefa tarefa;

    public AtribuicaoDTO atribuicaoDTO(AtribuiTarefa atribuiTarefa){
        BeanUtils.copyProperties(atribuiTarefa,AtribuicaoDTO.this);
        return this;
    }

}
