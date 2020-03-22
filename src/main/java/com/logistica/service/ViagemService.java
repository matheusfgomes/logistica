package com.logistica.service;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistica.model.Viagem;
import com.logistica.repository.ViagemRepository;

@Service
public class ViagemService {

	@Autowired
	private ViagemRepository viagemRepository;

	public void save(@Valid Viagem viagem) {
		viagem.setCriadoEm(LocalDate.now());
		viagemRepository.save(viagem);
	}

}
