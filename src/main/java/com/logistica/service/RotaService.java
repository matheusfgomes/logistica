package com.logistica.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistica.model.Rota;
import com.logistica.repository.RotaRepository;

@Service
public class RotaService {

	@Autowired
	private RotaRepository rotaRepository;

	List<Rota> bases = new ArrayList<Rota>();

	public List<Rota> list() {
		return rotaRepository.findAll();
	}
}
