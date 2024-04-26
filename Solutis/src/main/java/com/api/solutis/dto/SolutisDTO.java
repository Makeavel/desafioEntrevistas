package com.api.solutis.dto;

import com.api.solutis.model.SolutisModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.text.DateFormat;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolutisDTO {

    private String string;

    private List<Character> vogal;

    private String tempoTotal;

    public SolutisDTO getSolutisDTO(SolutisModel solutis){
        BeanUtils.copyProperties(solutis,SolutisDTO.this,"id");
        return this;
    }

}
