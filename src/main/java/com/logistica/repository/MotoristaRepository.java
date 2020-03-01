package com.logistica.repository;

import com.logistica.model.Motorista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MotoristaRepository
 */
@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {

}