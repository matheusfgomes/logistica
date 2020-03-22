package com.logistica.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistica.model.Motorista;
import com.logistica.repository.MotoristaRepository;

/**
 * MotoristaService
 */
@Service
public class MotoristaService {

	Logger LOGGER = Logger.getLogger(MotoristaService.class.getName());

	@Autowired
	private MotoristaRepository motoristaRepository;

	List<Motorista> motoristas = new ArrayList<Motorista>();

	public List<Motorista> list() {
		return motoristaRepository.findAll();
	}

	public Optional<Motorista> save(@Valid Motorista motorista) {

		motorista.setCriadoEm(LocalDate.now());
		motoristaRepository.save(motorista);
		Optional<Motorista> opMotorista = motoristaRepository.findById(motorista.getId());

		return opMotorista;
	}

	public Optional<Motorista> update(@Valid Motorista motorista) {
		Optional<Motorista> opMotorista = motoristaRepository.findById(motorista.getId());

		if (opMotorista.isPresent()) {

			motoristaRepository.save(motorista);

		}
		return opMotorista;
	}

	public void delete(Optional<Motorista> opMotorista) {
		motoristaRepository.deleteById(opMotorista.get().getId());

	}

	public Optional<Motorista> findByIdMotorista(Long idMotorista) {

		Optional<Motorista> opMotorista = motoristaRepository.findById(idMotorista);
		return opMotorista;
	}
}