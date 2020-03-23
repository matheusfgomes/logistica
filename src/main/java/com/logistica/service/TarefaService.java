package com.logistica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistica.model.Tarefa;
import com.logistica.repository.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository tarefaRepository;

	public void save(Tarefa tarefa) {
		tarefaRepository.save(tarefa);

	}

}
