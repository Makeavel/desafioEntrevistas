package com.api.simplify.model;

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
@Table(name = "tb_suportes_atendidos")
public class AtribuiTarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID suporte;

    @OneToOne  // mudar aqui para oneToMany ***
    private Atendente atendente;

    @OneToOne
    private Tarefa tarefa;

}
