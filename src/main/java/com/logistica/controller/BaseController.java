package com.logistica.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@RequestMapping("/")
	public String index() {

		return ("Hello World");
	}

	@GetMapping
	public ResponseEntity<List<Base>> list() {
		LOG.debug("list()");

		final List<Base> list = baseService.list();
		if (list.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(list);
	}

	@DeleteMapping(path = "/delete/{idBase}")
	public ResponseEntity<Responser<Base>> delete(@PathVariable Long idBase) {
		Optional<Base> opBase = null;
		try {
			opBase = baseService.findByIdBase(idBase);
			LOG.debug("deleting({" + opBase.get().toString() + "})");

		} catch (Exception e) {
			System.err.println("Não foi possivel achar esse registro em nossa base de Dados: " + e);
			LOG.info("Registro não Encontrado!", opBase.get());
			return ResponseEntity.notFound().build();
		}

		try {
			baseService.delete(opBase);
			LOG.info("Regristro excluido!", opBase.get().toString());
			return ResponseEntity.noContent().build();
		} catch (Exception e) {

			System.err.println("Erro ao excluir  : " + e);
			LOG.info("Registro invalido!", opBase.get());
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/register")
	public ResponseEntity<Responser<Base>> register(@Valid @RequestBody Base base) {
		Responser<Base> response = new Responser<>();
		if (base.getCodBase().equals(0) || base.getUF() == null || base.getCidade() == null
				|| base.getNomeBase() == null || base.getLatitude() == null || base.getLatitude() == null) {
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
			response.setData(base);
			LOG.info("A conferência foi salva com sucesso: " + base.toString());
			return ResponseEntity.ok(response);
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

	@PutMapping(path = "/update")
	public ResponseEntity<Responser<Base>> alterar(@Valid @RequestBody Base base) {
		LOG.debug("alterando{}", base.toString());
		Responser<Base> response = new Responser<>();

		Optional<Base> opBase = baseService.update(base);
		if (!opBase.isPresent()) {
			LOG.info("Não existe essa base: ");
			return ResponseEntity.noContent().build();
		}
		response.setData(opBase.get());
		LOG.info("A Base foi alterada com sucesso: " + opBase.get().toString());
		return ResponseEntity.ok(response);
	}

}
