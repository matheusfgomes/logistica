package com.logistica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistica.model.Motorista;

/**
 * MotoristaRepository
 */
@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
	
	

}