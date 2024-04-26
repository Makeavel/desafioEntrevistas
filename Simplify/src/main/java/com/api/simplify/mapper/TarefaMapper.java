package com.api.simplify.mapper;

import com.api.simplify.dto.AtendenteDTO;
import com.api.simplify.dto.TarefaDTO;
import com.api.simplify.model.Tarefa;

public interface TarefaMapper {

    TarefaDTO convertMapperDTO(Tarefa tarefa);
}
