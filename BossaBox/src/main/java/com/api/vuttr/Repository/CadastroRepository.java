package com.api.vuttr.Repository;

import com.api.vuttr.model.Cadastros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastros, UUID> {

    List<Cadastros> findAllByTags(String tags);

    List<Cadastros> findAllByName(String nome);
}
