package com.api.solutis.service;

import com.api.solutis.dto.SolutisDTO;
import com.api.solutis.model.SolutisModel;

import java.util.List;

public interface SolutisService {
    SolutisDTO postEntrada(SolutisModel solutisModel);
    
    List<SolutisDTO> getAllEntradas();
}
