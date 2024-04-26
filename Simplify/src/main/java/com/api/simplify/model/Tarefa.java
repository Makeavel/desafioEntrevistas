package com.api.simplify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Boolean realizado; // mudar para realizado
    private Boolean prioridade;

    // tem que conectar atendente aqui, por ID se possível
    //@ManyToOne
    //private Atendente atendente;

}
