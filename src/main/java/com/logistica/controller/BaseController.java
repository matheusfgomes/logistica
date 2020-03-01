package com.logistica.controller;

import java.util.List;

import javax.validation.Valid;
import javax.xml.ws.Response;

import com.logistica.Response.Responser;
import com.logistica.model.Base;
import com.logistica.service.BaseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Response<Base>> salvar(@Valid @RequestBody final Base base) {
        
        baseService.add(base);
        // LOG.debug("salvando({})", base);
        // Responser<Base> response = new Responser<>();

        return null;
    }

}
/*
 * 
 * @PostMapping public ResponseEntity<Response<CaixaConferencia>>
 * salvar(@Valid @RequestBody CaixaConferencia caixaConferencia) {
 * LOG.debug("salvando({})", caixaConferencia); Response<CaixaConferencia>
 * response = new Response<>(); if (caixaConferencia.getCaixas() == null) {
 * response.getErrors().
 * add("Esta conferencia não está vinculada com nenhum caixa"); StringBuilder
 * errosBuilder = new StringBuilder(); response.getErrors().stream().forEach(s
 * -> { errosBuilder.append("Erros: ").append(s).append(" "); });
 * LOG.info(errosBuilder.toString()); return
 * ResponseEntity.badRequest().body(response); } Optional<CaixaConferencia>
 * opCaixaConferencia = caixaConferenciaService.save(caixaConferencia); if
 * (!opCaixaConferencia.isPresent()) {
 * response.getErrors().add("Problema ao inserir conferencia do caixa");
 * StringBuilder errosBuilder = new StringBuilder();
 * response.getErrors().stream().forEach(s -> {
 * errosBuilder.append("Erros: ").append(s).append(" "); });
 * LOG.info(errosBuilder.toString()); return ResponseEntity.noContent().build();
 * } response.setData(opCaixaConferencia.get());
 * LOG.info("A conferência foi salva com sucesso: " +
 * opCaixaConferencia.get().toString()); return ResponseEntity.ok(response); }
 */