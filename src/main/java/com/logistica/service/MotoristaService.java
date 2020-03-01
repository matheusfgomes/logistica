package com.logistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.logistica.model.Motorista;
import com.logistica.repository.MotoristaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}