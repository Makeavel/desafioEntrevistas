package com.api.vuttr.service;

import com.api.vuttr.dto.CadastroDTO;
import com.api.vuttr.model.Cadastros;

import java.util.List;

public interface CadastroService {

    List<CadastroDTO> getAllRegistros();

    CadastroDTO postRegistro(Cadastros cadastros);

    List<CadastroDTO> getRegisterName(String nome);

    List<CadastroDTO> getRegisterTags(String tags);
}
