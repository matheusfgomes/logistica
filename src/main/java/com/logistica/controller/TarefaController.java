package com.logistica.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistica.Response.Responser;
import com.logistica.model.Tarefa;
import com.logistica.service.TarefaService;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

	private static final Logger LOG = LoggerFactory.getLogger(BaseController.class);
	@Autowired
	private TarefaService tarefaService;

	@RequestMapping("/")
	public String index() {

		return ("Hello World");
	}

	@PostMapping("/register")
	public ResponseEntity<Responser<Tarefa>> register(@Valid @RequestBody Tarefa tarefa) {
		Responser<Tarefa> response = new Responser<>();
		Optional<Tarefa> opTarefa = null;
		try {
			tarefaService.save(tarefa);
			response.setData(tarefa);
			LOG.info("A Tarefa foi salva com sucesso: " + tarefaService.toString());
			return ResponseEntity.ok(response);
		} catch (Exception e) {

			response.getErrors().add("Já existe esse Registro em nossa base de dadaos.");
			StringBuilder errosBuilder = new StringBuilder();
			response.getErrors().stream().forEach(s -> {
				errosBuilder.append("Erros: ").append(s).append(" ");
			});
			LOG.info(errosBuilder.toString());
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(response);
		}
	}
}
