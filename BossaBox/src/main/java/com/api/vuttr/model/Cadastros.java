package com.api.vuttr.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_cadastros")
public class Cadastros {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID idCadastro;

    public String name;

    public String description;

    @ElementCollection
    public List<String> links;

    @ElementCollection
    public List<String> tags;

}
