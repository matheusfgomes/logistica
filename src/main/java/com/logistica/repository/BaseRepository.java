package com.logistica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.logistica.model.Base;

/**
 * BaseRepository
 */
@Repository
public interface BaseRepository extends JpaRepository<Base, Long> {

    @Query(value = "SELECT * FROM base b WHERE b.nome_base  = ?",nativeQuery = true)
    Optional<Base> findByName(String nome);

    
    @Query(value = "SELECT * FROM Base  WHERE  cod_base  =  ?",nativeQuery = true)
    Optional<Base> findByCodigoBase(Long codBase);

    
}