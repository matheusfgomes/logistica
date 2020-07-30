package com.logistica.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Carga
 */
@Getter
@Setter
@Entity
@Table(name = "carga")
@JsonInclude(Include.NON_NULL)
public class Carga implements Serializable, Registro {

    private static final long serialVersionUID = 5451234181584231L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarga;
    private String notaFiscal;
    private Integer volumeCarga;
    private Double peso;
    @ManyToOne
    @JoinColumn(name = "id_tarefa")
    private Tarefa tarefa;
    @OneToOne(mappedBy = "carga")
    private Rota rota;
    private LocalDate alteradoEm;
    private String alteradoPor;
    private LocalDate criandoEm;
    private String criadoPor;


    @Override
    public String getCriadoPor() {
        return this.criadoPor;
    }

    @Override
    public void setCriadoPor(String criadoPor) {
        this.criadoPor = criadoPor;
    }

    @Override
    public String getAlteradoPor() {
        return this.alteradoPor;
    }

    @Override
    public void setAlteradoPor(String alteradoPor) {
        this.alteradoPor = alteradoPor;
    }

    @Override
    public LocalDate getCriadoEm() {
        return this.criandoEm;
    }

    @Override
    public void setCriadoEm(LocalDate date) {
        this.criandoEm = date;
    }

    @Override
    public void setAlteradoEm(LocalDate date) {
        this.alteradoEm = date;
    }

    @Override
    public LocalDate getAlteradoEm() {
        return this.alteradoEm;
    }

    @Override
    public Usuario getUsuario() {
        Usuario usua = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return usua;
    }

}
