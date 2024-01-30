package com.api.simplify.mapper;

import com.api.simplify.dto.AtribuicaoDTO;
import com.api.simplify.model.AtribuiTarefa;

public interface AtribuiMapper {
    AtribuicaoDTO convertMapperDTO(AtribuiTarefa atribuiTarefa);
}
