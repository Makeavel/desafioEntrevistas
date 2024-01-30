package com.api.simplify.mapper;

import com.api.simplify.dto.AtendenteDTO;
import com.api.simplify.model.Atendente;

public interface AtendenteMapper {
    AtendenteDTO convertMapperDTO(Atendente atendente);
}
