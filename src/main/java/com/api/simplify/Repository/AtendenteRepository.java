package com.api.simplify.Repository;

import com.api.simplify.model.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AtendenteRepository extends JpaRepository<Atendente, Integer> {


}
