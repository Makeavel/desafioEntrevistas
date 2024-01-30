package com.api.simplify.service;

import com.api.simplify.Repository.TarefaRepository;
import com.api.simplify.dto.TarefaDTO;
import com.api.simplify.mapper.TarefaMapper;
import com.api.simplify.model.Tarefa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TarefaServiceImpl implements TarefaService{

    private final TarefaRepository repository;
    private final TarefaMapper tarefaMapper;
    private TarefaDTO dto;

    @Override
    public List<TarefaDTO> getAllTarefas() {
        List<Tarefa> listTarefa = repository.findAll();
        return listTarefa.stream().map(tarefaMapper::convertMapperDTO).collect(Collectors.toList());
    }

    @Override
    public TarefaDTO getTarefaById(Integer id) {
        dto = new TarefaDTO();
        Tarefa findTarefa = repository.findById(id).orElseThrow(() -> new IllegalArgumentException(
                "Tarefa not exists with a given id : " + id));
        dto.tarefasDTO(findTarefa);
        return dto;
    }

    @Override
    public TarefaDTO postTarefas(Tarefa tarefa) {
        dto = new TarefaDTO();
        repository.save(tarefa);
        dto.tarefasDTO(tarefa);
        return dto;
    }

    @Override
    public String deleteTarefa(Integer idTarefa) {

        if(idTarefa.toString().isBlank()){
            return "ID ("+ idTarefa + ") NÃO ENCONTRADO";
        }
        try {
            repository.deleteById(idTarefa);
            return "("+idTarefa + ") - deletado com sucesso";

        }catch (ExceptionInInitializerError e){
            return "deu ruim, mensagem do erro: " + e;
        }

    }
}
