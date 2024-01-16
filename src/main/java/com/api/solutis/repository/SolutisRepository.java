package com.api.solutis.repository;

import com.api.solutis.model.SolutisModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SolutisRepository extends JpaRepository<SolutisModel, UUID> {
}
