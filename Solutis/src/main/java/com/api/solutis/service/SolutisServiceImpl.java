package com.api.solutis.service;

import com.api.solutis.dto.SolutisDTO;
import com.api.solutis.mapper.SolutisMapper;
import com.api.solutis.model.SolutisModel;
import com.api.solutis.repository.SolutisRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SolutisServiceImpl implements SolutisService {

    private final SolutisRepository repository;
    private final SolutisMapper modelMapper;

    @Override
    public List<SolutisDTO> getAllEntradas() {
        List<SolutisModel> model = repository.findAll();
        return model.stream().map(modelMapper::convertMapperDTO).collect(Collectors.toList());
    }

    @Override
    public SolutisDTO postEntrada(SolutisModel solutisModel) {

        long  start = System.currentTimeMillis();
        SolutisDTO solutisDTO = new SolutisDTO();
        Set<Character> vogaisEncontradas = new HashSet<>();
        Set<Character> vogaisRepetidas = new HashSet<>();
        List<Character> resultados = new ArrayList<>();

        for( int i = 1 ; i < solutisModel.getString().length()-1; i++){

            char caracterAnterior = solutisModel.getString().charAt(i-1);
            char caracterAtual = solutisModel.getString().charAt(i);
            char caracterProximo = solutisModel.getString().charAt(i+1);

            boolean operacao = regraNegocio(caracterAnterior, caracterAtual, caracterProximo);

            if(validaVogal(caracterAnterior) && vogaisEncontradas.contains(caracterAnterior)){
                vogaisRepetidas.add(caracterAnterior);
            }
            else if(validaVogal(caracterProximo) && vogaisEncontradas.contains(caracterProximo)){
                vogaisRepetidas.add(caracterAnterior);
            }
            else if(validaVogal(caracterAnterior)){
                vogaisEncontradas.add(caracterAnterior);
            }

            if(operacao) {
                if (!vogaisEncontradas.contains(caracterProximo) && !vogaisRepetidas.contains(caracterProximo)) {
                    vogaisEncontradas.add(caracterProximo);
                    resultados.add(caracterProximo);
                }
            }
        }

        solutisModel.setVogal(resultados);
        long end = (System.currentTimeMillis() - start);
        String tempoFormatado = String.valueOf(end);
        solutisModel.setTempoTotal(tempoFormatado+"ms");
        repository.save(solutisModel);

        return solutisDTO.getSolutisDTO(solutisModel);
    }

    private Boolean validaVogal(char letra){
        String vogais = "aeiouAEIOU";
        return vogais.indexOf(letra) != -1;
    }

    private Boolean regraNegocio(char letra1 , char letra2, char letra3){
        boolean char1 = validaVogal(letra1);
        boolean char2 = validaVogal(letra2);
        boolean char3 = validaVogal(letra3);
        return char1 && !char2 && char3;
    }

}

