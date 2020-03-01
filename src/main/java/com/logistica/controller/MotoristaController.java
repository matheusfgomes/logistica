package com.logistica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MotoristaController
 */
@RestController
@RequestMapping("/motorista")
public class MotoristaController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

}