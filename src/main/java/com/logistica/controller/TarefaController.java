package com.logistica.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tarefa")
public class TarefaController {

	private static final Logger LOG = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping("/")
	public String index() {

		return ("Hello World");
	}

}
