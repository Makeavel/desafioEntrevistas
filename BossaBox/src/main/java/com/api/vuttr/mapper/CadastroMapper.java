package com.api.vuttr.mapper;

import com.api.vuttr.dto.CadastroDTO;
import com.api.vuttr.model.Cadastros;

public interface CadastroMapper {

    CadastroDTO convertMapperDTO(Cadastros cadastros);

    Cadastros convertMapperEntity(CadastroDTO cadastroDTO);
}
