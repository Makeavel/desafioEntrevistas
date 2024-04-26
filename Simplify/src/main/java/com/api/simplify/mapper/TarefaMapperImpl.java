package com.api.simplify.mapper;

import com.api.simplify.dto.AtendenteDTO;
import com.api.simplify.dto.TarefaDTO;
import com.api.simplify.model.Tarefa;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TarefaMapperImpl implements TarefaMapper{

    private final ModelMapper modelMapper;

    @Override
    public TarefaDTO convertMapperDTO(Tarefa tarefa) {
        return modelMapper.map(tarefa, TarefaDTO.class);
    }

}
