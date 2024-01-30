package com.api.simplify.mapper;

import com.api.simplify.dto.AtribuicaoDTO;
import com.api.simplify.model.AtribuiTarefa;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AtribuiMapperImpl implements AtribuiMapper{

    private final ModelMapper modelMapper;

    @Override
    public AtribuicaoDTO convertMapperDTO(AtribuiTarefa atribuiTarefa){
        return modelMapper.map(atribuiTarefa, AtribuicaoDTO.class);
    }
}
