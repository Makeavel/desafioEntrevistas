package com.api.simplify.service;

import com.api.simplify.Repository.AtendenteRepository;
import com.api.simplify.Repository.AtribuicaoRepository;
import com.api.simplify.Repository.TarefaRepository;
import com.api.simplify.dto.AtribuicaoDTO;
import com.api.simplify.mapper.AtribuiMapper;
import com.api.simplify.model.Atendente;
import com.api.simplify.model.AtribuiTarefa;
import com.api.simplify.model.Tarefa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AtribuicaoServiceImpl implements AtribuicaoService{

    private final AtribuicaoRepository atribuicaoRepository;
    private final AtendenteRepository atendenteRepository;
    private final TarefaRepository tarefaRepository;
    private final AtribuiMapper mapper;
    private AtribuicaoDTO dto;

    @Override
    public List<AtribuicaoDTO> getAtribuiAll() {
        List<AtribuiTarefa> atribuiTarefaList = atribuicaoRepository.findAll();
        return atribuiTarefaList.stream().map(mapper::convertMapperDTO).collect(Collectors.toList());
    }


    @Override
    public AtribuicaoDTO getByIdAtribuicao(UUID idSuporte) {
        dto = new AtribuicaoDTO();
        AtribuiTarefa atribuicao = atribuicaoRepository.findBySuporte(idSuporte);

        dto.atribuicaoDTO(atribuicao);
        return dto;
    }

    @Override
    public AtribuicaoDTO postAtribuicao(Integer idAtendente, Integer idTarefa) {
        dto = new AtribuicaoDTO();
        AtribuiTarefa atribuiTarefa = new AtribuiTarefa();
        Atendente atendente = atendenteRepository.findById(idAtendente).orElseThrow(() -> new IllegalArgumentException(
                "Atendente not exists with a given id : " + idAtendente));
        Tarefa tarefa = tarefaRepository.findById(idTarefa).orElseThrow(() -> new IllegalArgumentException(
                "Tarefa not exists with a given id : " + idTarefa));

        atribuiTarefa.setAtendente(atendente);
        atribuiTarefa.setTarefa(tarefa);

        atribuicaoRepository.save(atribuiTarefa);
        atualizaTarefa(idTarefa);
        dto.atribuicaoDTO(atribuiTarefa);
        return dto;
    }



    private void atualizaTarefa(Integer idTarefa){

        Tarefa tarefa = tarefaRepository.findById(idTarefa).orElseThrow(() -> new IllegalArgumentException("Deu ruim na tarefa " + idTarefa));
        Boolean tarefaRealizada = true;

        tarefa.setRealizado(tarefaRealizada);
        tarefaRepository.save(tarefa);

    }

}
