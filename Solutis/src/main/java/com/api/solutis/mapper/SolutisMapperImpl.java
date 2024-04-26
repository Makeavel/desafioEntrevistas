package com.api.solutis.mapper;

import com.api.solutis.dto.SolutisDTO;
import com.api.solutis.model.SolutisModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SolutisMapperImpl implements SolutisMapper{

    private final ModelMapper modelMapper;

    @Override
    public SolutisDTO convertMapperDTO(SolutisModel solutisModel) {
        return modelMapper.map(solutisModel, SolutisDTO.class);
    }
}
