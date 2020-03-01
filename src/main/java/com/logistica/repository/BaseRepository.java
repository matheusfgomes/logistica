package com.logistica.repository;

import com.logistica.model.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BaseRepository
 */
@Repository
public interface BaseRepository extends JpaRepository<Base, Long> {

}