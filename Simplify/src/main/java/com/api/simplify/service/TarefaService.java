package com.api.simplify.service;

import com.api.simplify.dto.TarefaDTO;
import com.api.simplify.model.Tarefa;

import java.util.List;
import java.util.Optional;

public interface TarefaService {

    List<TarefaDTO> getAllTarefas();

    TarefaDTO getTarefaById(Integer id);

    TarefaDTO postTarefas(Tarefa tarefa);

    String deleteTarefa(Integer idTarefa);
}
