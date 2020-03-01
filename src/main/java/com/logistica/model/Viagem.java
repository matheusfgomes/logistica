package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * Viagem
 */
public class Viagem implements Serializable, Registro {

    private static final long serialVersionUID = 1L;
    private Integer idViagem;
    private Base base;
    private Motorista motorista;
    private StatusViagem statusViagem;
    private List<Tarefa> tarefas;
    private LocalDate alteradoEm;
    private String alteradoPor;
    private LocalDate criandoEm;
    private String criadoPor;

    public Integer getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(Integer idViagem) {
        this.idViagem = idViagem;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public StatusViagem getStatusViagem() {
        return statusViagem;
    }

    public void setStatusViagem(StatusViagem statusViagem) {
        this.statusViagem = statusViagem;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
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