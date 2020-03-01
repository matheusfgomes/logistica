package com.logistica.repository;

import java.util.Optional;

import com.logistica.model.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * BaseRepository
 */
@Repository
public interface BaseRepository extends JpaRepository<Base, Long> {

    @Query(value = "SELECT * FROM base b WHERE b.nome_base  = ?",nativeQuery = true)
    Optional<Base> findByName(String nome);

    
}