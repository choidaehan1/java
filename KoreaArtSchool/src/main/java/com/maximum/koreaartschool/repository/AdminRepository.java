package com.maximum.koreaartschool.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maximum.koreaartschool.entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {
    Optional<AdminEntity> findByAdminID(String adminID); // Modified method signature
}
