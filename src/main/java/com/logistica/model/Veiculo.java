package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Veiculo
 */
public class Veiculo implements Serializable, Registro {

    private static final long serialVersionUID = 1L;
    private Integer idVeiculo;
    private Base base;
    private String cidade;
    private String placa;
    private UF uf;
    private TipoVeiculo tipoVeiculo;
    private StatusVeiculo statusVeiculo;

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(final Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(final Base base) {
        this.base = base;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(final String cidade) {
        this.cidade = cidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(final String placa) {
        this.placa = placa;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(final UF uf) {
        this.uf = uf;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(final TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public StatusVeiculo getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(final StatusVeiculo statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
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