package com.logistica.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistica.Response.Responser;
import com.logistica.model.Base;
import com.logistica.service.BaseService;

/**
 * BaseController
 */
@RestController
@RequestMapping("/base")
public class BaseController {

	private static final Logger LOG = LoggerFactory.getLogger(BaseController.class);

	@Autowired
	private BaseService baseService;

	@GetMapping
	public ResponseEntity<List<Base>> list() {
		LOG.debug("list()");

		final List<Base> list = baseService.list();
		if (list.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(list);
	}

	@RequestMapping("/")
	public String index() {

		return ("Hello World");
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Responser<Base>> salvar(@Valid @RequestBody Base base) {
		Responser<Base> response = new Responser<>();
		if (base.getCodBase().equals(0) || base.getUF() == null || base.getCidade() == null
				|| base.getNomeBase() == null) {
			response.getErrors().add("É preenchumento dos campos é obrigatorio");
			StringBuilder errosBuilder = new StringBuilder();
			response.getErrors().stream().forEach(s -> {
				errosBuilder.append("Erros: ").append(s).append(" ");
			});
			LOG.info(errosBuilder.toString());
			return ResponseEntity.badRequest().body(response);
		}
		Optional<Base> opBase = baseService.findByName(base);
		if (!opBase.isPresent()) {
			baseService.save(base);
		} else {
			response.getErrors().add("Já existe esse Registro em nossa base de dadaos.");
			StringBuilder errosBuilder = new StringBuilder();
			response.getErrors().stream().forEach(s -> {
				errosBuilder.append("Erros: ").append(s).append(" ");
			});
			LOG.info(errosBuilder.toString());
		}

		return ResponseEntity.ok(response);
	}

}
