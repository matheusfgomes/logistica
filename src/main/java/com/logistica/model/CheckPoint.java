package com.logistica.model;

import org.springframework.security.core.context.SecurityContextHolder;

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
    private LocalDate alteradoEm;
    private String alteradoPor;
    private LocalDate criandoEm;
    private String criadoPor;


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
