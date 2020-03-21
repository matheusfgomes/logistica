package com.logistica.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.xml.ws.Response;

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
import com.logistica.model.Motorista;
import com.logistica.service.MotoristaService;

/**
 * MotoristaController
 */
@RestController
@RequestMapping("/motorista")
public class MotoristaController {

	
	private static final Logger LOG = LoggerFactory.getLogger(BaseController.class);

	@Autowired
	private MotoristaService motoristaService;

	
    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

	@GetMapping
	public ResponseEntity<List<Motorista>> list() {
		LOG.debug("list()");

		final List<Motorista> list = motoristaService.list();
		if (list.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Responser<Motorista>> register(@Valid @RequestBody Motorista motorista) {
		LOG.debug("salvando({})", motorista);
		Responser<Motorista> response = new Responser<>();
		if (motorista.getBase() == null) {
			response.getErrors().add("É necessario uma base cadastrada");
			StringBuilder errosBuilder = new StringBuilder();
			response.getErrors().stream().forEach(s -> {
				errosBuilder.append("Erros: ").append(s).append(" ");
			});
			LOG.info(errosBuilder.toString());
			return ResponseEntity.badRequest().body(response);
		}
		
		Optional<Motorista> opMotorista= motoristaService.save(motorista);
		if (!opMotorista.isPresent()) {
			response.getErrors().add("Problema ao inserir motorista");
			StringBuilder errosBuilder = new StringBuilder();
			response.getErrors().stream().forEach(s -> {
				errosBuilder.append("Erros: ").append(s).append(" ");
			});
			LOG.info(errosBuilder.toString());
			return ResponseEntity.noContent().build();
		}
		response.setData(opMotorista.get());
		LOG.info("O motorista  foi registrado com sucesso: " + opMotorista.get().toString());
		return ResponseEntity.ok(response);
	}
    
	
    

}