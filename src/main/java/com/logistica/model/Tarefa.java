package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * Tarefa
 */
public class Tarefa implements Serializable, Registro {

    private static final long serialVersionUID = 1L;
    
    private Integer idTarefa;
    private Viagem viagem;
    private String nomeRemetente;
    private String nomeDestinatario;
    private String cgcRemetente;
    private String cgcDestinatario;
    private List<Carga> cargas;
    private Integer numDocumento;
    private LocalDate previsaoEntrega;
    private LocalDate alteradoEm;
    private String alteradoPor;
    private LocalDate criandoEm;
    private String criadoPor;

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(final Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(final Viagem viagem) {
        this.viagem = viagem;
    }

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public void setNomeRemetente(final String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(final String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getCgcRemetente() {
        return cgcRemetente;
    }

    public void setCgcRemetente(final String cgcRemetente) {
        this.cgcRemetente = cgcRemetente;
    }

    public String getCgcDestinatario() {
        return cgcDestinatario;
    }

    public void setCgcDestinatario(final String cgcDestinatario) {
        this.cgcDestinatario = cgcDestinatario;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(final List<Carga> cargas) {
        this.cargas = cargas;
    }

    public Integer getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(final Integer numDocumento) {
        this.numDocumento = numDocumento;
    }

    public LocalDate getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(final LocalDate previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

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

}