package com.api.simplify.service;

import com.api.simplify.dto.AtendenteDTO;
import com.api.simplify.model.Atendente;

import java.util.List;

public interface AtendenteService {

    List<AtendenteDTO> getAllAtendentes();

    AtendenteDTO getAtententeById(Integer id);

    AtendenteDTO postAtendente(Atendente atendente);

    String deleteAtendente(Integer id);

    AtendenteDTO putAtendente(Atendente atendente);
}
