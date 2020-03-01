package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Carga
 */
public class Carga implements Serializable, Registro {

    private static final long serialVersionUID = 1L;
    private Integer idCarga;
    private String notaFiscal;
    private Integer volumeCarga;
    private Double peso;

    public Integer getIdCarga() {
        return idCarga;
    }

    public void setIdCarga(Integer idCarga) {
        this.idCarga = idCarga;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Integer getVolumeCarga() {
        return volumeCarga;
    }

    public void setVolumeCarga(Integer volumeCarga) {
        this.volumeCarga = volumeCarga;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
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