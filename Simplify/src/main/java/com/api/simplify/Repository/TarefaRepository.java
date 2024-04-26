package com.api.simplify.Repository;

import com.api.simplify.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
}
