package com.logistica.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Ocorrencia
 */
@Getter
@Setter
public class Ocorrencia implements Serializable, Registro {

    private static final long serialVersionUID = 1L;
    private Integer idOcorrencia;
    private Integer codOcorrencia;
    private String descricao;
    private TipoOcorrencia tipoOcorrencia;
    private StatusOcorrencia statusOcorrencia;
    private LocalDate alteradoEm;
    private String alteradoPor;
    private LocalDate criandoEm;
    private String criadoPor;


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
