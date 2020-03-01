package com.logistica.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.logistica.model.Base;
import com.logistica.model.EstadoSigla;
import com.logistica.repository.BaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BaseService
 */
@Service
public class BaseService {

	@Autowired
	private BaseRepository baseRepository;

	List<Base> bases = new ArrayList<Base>();

	public List<Base> list() {
		return baseRepository.findAll();
	}

	public Base save(Base base) {

		for (EstadoSigla es : EstadoSigla.values()) {
			if (base.getUF().indexOf(es.name()) > -1) {
				base.setCriadoEm(LocalDate.now());
				base.setCriadoPor("Fase de Teste!");
				baseRepository.save(base);
			}
		}

		return base;
	}

	public Optional<Base> findByName(Base base) {
		return baseRepository.findByName(base.getNomeBase());
	}

}