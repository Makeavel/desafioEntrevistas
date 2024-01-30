package com.api.simplify.service;

import com.api.simplify.dto.AtribuicaoDTO;

import java.util.List;
import java.util.UUID;

public interface AtribuicaoService {

    List<AtribuicaoDTO> getAtribuiAll();

    AtribuicaoDTO postAtribuicao(Integer idAtendente, Integer idTarefa);

    AtribuicaoDTO getByIdAtribuicao(UUID idSuporte);
}
