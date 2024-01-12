package com.api.vuttr.service;

import com.api.vuttr.Repository.CadastroRepository;
import com.api.vuttr.dto.CadastroDTO;
import com.api.vuttr.mapper.CadastroMapper;
import com.api.vuttr.model.Cadastros;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CadastroServiceImpl implements CadastroService {

    private final CadastroRepository repository;
    private final CadastroMapper modelMapper;


    @Override
    public List<CadastroDTO> getAllRegistros() {
        List<Cadastros> cad = repository.findAll();
        return cad.stream().map(modelMapper::convertMapperDTO).collect(Collectors.toList());
    }

    @Override
    public List<CadastroDTO> getRegisterName(String nome) {
        List<Cadastros> cad = repository.findAllByName(nome);
        return cad.stream().map(modelMapper::convertMapperDTO).collect(Collectors.toList());
    }

    @Override
    public List<CadastroDTO> getRegisterTags(String tags) {
        List<Cadastros> cad = repository.findAllByTags(tags);
        return cad.stream().map(modelMapper::convertMapperDTO).collect(Collectors.toList());
    }

    @Override
    public CadastroDTO postRegistro(Cadastros cadastros) {
        if (validaRegistro(cadastros)) {
            CadastroDTO dto = new CadastroDTO();
            dto.retornoDTO(cadastros);
            repository.save(cadastros);
            return dto;
        }
        else{
            throw new IllegalArgumentException("Argumento inválido");
        }
    }


    private boolean validaRegistro(Cadastros cadastros){
        return cadastros != null && !cadastros.name.isEmpty();
    }
}
