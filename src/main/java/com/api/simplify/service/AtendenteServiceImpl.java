package com.api.simplify.service;

import com.api.simplify.Repository.AtendenteRepository;
import com.api.simplify.dto.AtendenteDTO;
import com.api.simplify.model.Atendente;
import lombok.RequiredArgsConstructor;
import com.api.simplify.mapper.AtendenteMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AtendenteServiceImpl implements AtendenteService{

    private final AtendenteRepository repository;
    private final AtendenteMapper atendenteMapper;
    private AtendenteDTO dto;

    @Override
    public List<AtendenteDTO> getAllAtendentes() {
        List<Atendente> listAtendente = repository.findAll();
        return listAtendente.stream().map(atendenteMapper::convertMapperDTO).collect(Collectors.toList());
    }

    @Override       // fazer essa aqui
    public AtendenteDTO getAtententeById(Integer id) {
        dto = new AtendenteDTO();
        //repository.findById(id);
        Atendente atendente = repository.findById(id).orElseThrow(() -> new IllegalArgumentException(
                "Atendente not exists with a given id : " + id));
        dto.setNome(atendente.getNome());
        //dto.setTarefas(atendente.getTarefas());
        return dto;
    }

    @Override
    public AtendenteDTO postAtendente(Atendente atendente) {
       if(!atendente.getNome().isEmpty()) {
           dto = new AtendenteDTO();
           repository.save(atendente);
           dto.PostatendenteDTO(atendente);
           return dto;
       }else{
           throw new IllegalArgumentException("Argumento inválido");
       }
    }

    @Override
    public AtendenteDTO putAtendente(Atendente atendente) {
        dto = new AtendenteDTO();
        repository.save(atendente);
        dto.PostatendenteDTO(atendente);
        return dto;
    }

    @Override
    public String deleteAtendente(Integer id) {

        if(id.toString().isBlank()){
            return "ID INVÁLIDO";
        }
        try {
            repository.deleteById(id);
            return "- " + id + " Deletado com Sucesso";
        }catch (Exception e){
            return "Deu ruim, erro: " + e;
        }
    }


}