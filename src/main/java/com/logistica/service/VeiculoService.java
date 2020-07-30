package com.logistica.service;

import com.logistica.model.Base;
import com.logistica.model.EstadoSigla;
import com.logistica.model.Usuario;
import com.logistica.model.Veiculo;
import com.logistica.repository.BaseRepository;
import com.logistica.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {


    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private BaseRepository baseRepository;
    List<Veiculo> bases = new ArrayList<Veiculo>();

    public List<Veiculo> list() {
        return veiculoRepository.findAll();
    }


    public Veiculo save(Veiculo veiculo) {
        if (veiculo.getBase().getIdBase() != null) {
            for (EstadoSigla es : EstadoSigla.values()) {
                if (veiculo.getUf().indexOf(es.name()) > -1) {
                    veiculo.setCriadoEm(LocalDate.now());
                    veiculo.setCriadoPor(veiculo.getUsuario().getLogin());
                }
            }
            Optional<Base> opBase = baseRepository.findById(veiculo.getBase().getIdBase());
            if (opBase.isPresent()) {
                veiculo.setBase(opBase.get());
                return veiculoRepository.save(veiculo);
            }
        }
        return null;
    }



    public Optional<Veiculo> findByIdBase(Long id) {
        Optional<Veiculo> opVeiculo = veiculoRepository.findById(id);
        return opVeiculo;
    }

    public Optional<Veiculo> findByName(Veiculo veiculo) {
        return veiculoRepository.findByPlaca(veiculo.getPlaca());
    }

    public void delete(Optional<Veiculo> b) {
        veiculoRepository.deleteById(b.get().getIdVeiculo());
    }

    public Optional<Veiculo> update(@Valid Veiculo veiculo) {
        Optional<Veiculo> opBase = findByIdBase(veiculo.getIdVeiculo());
        if (opBase.isPresent()) {
            veiculoRepository.save(veiculo);
        }
        return opBase;
    }
}
