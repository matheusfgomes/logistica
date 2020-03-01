package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * TarefaOcorrencia
 */
public class TarefaOcorrencia implements Serializable, Registro {

    private static final long serialVersionUID = 1L;
    private Tarefa tarefa;
    private Ocorrencia ocorrencia;
    private byte[] foto;
    private LocalDate alteradoEm;
    private String alteradoPor;
    private LocalDate criandoEm;
    private String criadoPor;

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
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