package com.logistica.service;

import java.util.ArrayList;
import java.util.List;

import com.logistica.model.Base;
import com.logistica.repository.BaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BaseService
 */
@Service
public class BaseService {

    @Autowired
    private BaseRepository baseRepository;

    List<Base> bases = new ArrayList<Base>();

    public List<Base> list() {
        return baseRepository.findAll();
    }

    public String add(Base base) {
        baseRepository.save(base);
        return "SALVO";
    }

}