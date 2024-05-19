package com.maximum.koreaartschool.repository;

import com.maximum.koreaartschool.entity.EvaluatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EvaluatorLoginRepository extends JpaRepository<EvaluatorEntity, Long> {
    Optional<EvaluatorEntity> findByEvlEml(String evlEml);
}
