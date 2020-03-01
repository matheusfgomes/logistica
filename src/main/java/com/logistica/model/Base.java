package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Base
 * 
 * @see
 */
public class Base implements Serializable, Registro {

    private static final long serialVersionUID = 1L;
    private Integer idBase;
    private Integer codBase;
    private String cidade;

    public Integer getIdBase() {
        return idBase;
    }

    public void setIdBase(Integer idBase) {
        this.idBase = idBase;
    }

    public Integer getCodBase() {
        return codBase;
    }

    public void setCodBase(Integer codBase) {
        this.codBase = codBase;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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