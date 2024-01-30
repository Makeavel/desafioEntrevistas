package com.api.simplify.Repository;

import com.api.simplify.model.AtribuiTarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AtribuicaoRepository extends JpaRepository<AtribuiTarefa, UUID> {

    AtribuiTarefa findBySuporte(UUID idSuporte);

}
