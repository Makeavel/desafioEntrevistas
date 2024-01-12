package com.api.vuttr.mapper;

import com.api.vuttr.dto.CadastroDTO;
import com.api.vuttr.model.Cadastros;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroMapperImpl implements CadastroMapper{

    private final ModelMapper modelMapper;

    @Override
    public CadastroDTO convertMapperDTO(Cadastros cadastros) {
        return modelMapper.map(cadastros, CadastroDTO.class);
    }

    public Cadastros convertMapperEntity(CadastroDTO cadastroDTO){
        return modelMapper.map(cadastroDTO, Cadastros.class);
    }
}
