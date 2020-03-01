package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
    private String nome;
    private Integer cpf;
    private String categoriaCnh;
    private LocalDate dataNascimento;
    private Integer celular;
    private String vinculoMotorista;
    private String senhaExpirada;
    private StatusMotorista statusMotorista;

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

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
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

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setCriadoPor(String criadoPor) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getAlteradoPor() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setAlteradoPor(String alteradoPor) {
        // TODO Auto-generated method stub

    }

    @Override
    public LocalDate getCriadoEm() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LocalDate getAlteradoEm() {
        // TODO Auto-generated method stub
        return null;
    }

}