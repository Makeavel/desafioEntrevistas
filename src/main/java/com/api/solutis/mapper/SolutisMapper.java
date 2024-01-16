package com.api.solutis.mapper;

import com.api.solutis.dto.SolutisDTO;
import com.api.solutis.model.SolutisModel;

public interface SolutisMapper {

    SolutisDTO convertMapperDTO(SolutisModel solutisModel);
}
