package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * CheckPoint
 */
public class CheckPoint implements Serializable, Registro {

    private static final long serialVersionUID = 1L;
    private Integer idCheckPoint;
    private String descricao;
    private DescricaoCheckPoint descricaoCheckPoint;
    private TipoOcorrencia tipoOCOrrencia;

    public Integer getIdCheckPoint() {
        return idCheckPoint;
    }

    public void setIdCheckPoint(Integer idCheckPoint) {
        this.idCheckPoint = idCheckPoint;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public DescricaoCheckPoint getDescricaoCheckPoint() {
        return descricaoCheckPoint;
    }

    public void setDescricaoCheckPoint(DescricaoCheckPoint descricaoCheckPoint) {
        this.descricaoCheckPoint = descricaoCheckPoint;
    }

    public TipoOcorrencia getTipoOCOrrencia() {
        return tipoOCOrrencia;
    }

    public void setTipoOCOrrencia(TipoOcorrencia tipoOCOrrencia) {
        this.tipoOCOrrencia = tipoOCOrrencia;
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