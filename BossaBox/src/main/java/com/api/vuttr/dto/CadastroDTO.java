package com.api.vuttr.dto;

import com.api.vuttr.model.Cadastros;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CadastroDTO {

    public String name;
    public String description;
    public List<String> links;
    public List<String> tags;


    public CadastroDTO retornoDTO(Cadastros cadastros) {
        BeanUtils.copyProperties(cadastros, CadastroDTO.this , "id");
        return this;       //   1º argumento entrada, 2º este DTO, 3º deve ser ignorado
    }

}