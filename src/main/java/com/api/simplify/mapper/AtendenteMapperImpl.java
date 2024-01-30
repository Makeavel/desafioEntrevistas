package com.api.simplify.mapper;

import com.api.simplify.dto.AtendenteDTO;
import com.api.simplify.model.Atendente;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AtendenteMapperImpl implements AtendenteMapper{

    private final ModelMapper modelMapper;

    @Override
    public AtendenteDTO convertMapperDTO(Atendente atendente) {
        return modelMapper.map(atendente, AtendenteDTO.class);
    }
}
