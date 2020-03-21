package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Motorista
 */
@Entity
@Table(name = "motorista")
public class Motorista implements Serializable, Registro {

    private static final long serialVersionUID = 31231317251L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Base base;
    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;
    @NotBlank
    private String categoriaCnh;
    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate dataNascimento;
    @NotBlank
    private String celular;
    private String vinculoMotorista;
    private String senhaExpirada;
    private StatusMotorista statusMotorista;
    private LocalDate alteradoEm;
    private String alteradoPor;
    private LocalDate criandoEm;
    private String criadoPor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getVinculoMotorista() {
        return vinculoMotorista;
    }

    public void setVinculoMotorista(String vinculoMotorista) {
        this.vinculoMotorista = vinculoMotorista;
    }

    public String getSenhaExpirada() {
        return senhaExpirada;
    }

    public void setSenhaExpirada(String senhaExpirada) {
        this.senhaExpirada = senhaExpirada;
    }

    public StatusMotorista getStatusMotorista() {
        return statusMotorista;
    }

    public void setStatusMotorista(StatusMotorista statusMotorista) {
        this.statusMotorista = statusMotorista;
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