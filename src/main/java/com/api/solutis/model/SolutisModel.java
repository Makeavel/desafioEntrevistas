package com.api.solutis.model;

import jakarta.persistence.*;
import lombok.Data;

import java.text.DateFormat;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_registros")
public class SolutisModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String string;
    @ElementCollection
    private List<Character> vogal;
    private String tempoTotal;
}
