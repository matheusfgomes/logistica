package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * Base
 * 
 * @see
 */
@Entity
@Table(name = "base")
public class Base implements Serializable, Registro {

    private static final long serialVersionUID = 54581584231L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBase;
    @NotBlank
    private String nomeBase;
    private Integer codBase;
    @NotBlank
    private String cidade;
    private String UF;
    private LocalDate alteradoEm;
    private String alteradoPor;
    private LocalDate criandoEm;
    private String criadoPor;

    public Integer getIdBase() {
        return idBase;
    }

    public void setIdBase(final Integer idBase) {
        this.idBase = idBase;
    }

    public Integer getCodBase() {
        return codBase;
    }

    public void setCodBase(final Integer codBase) {
        this.codBase = codBase;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(final String cidade) {
        this.cidade = cidade;
    }
    
    
    public String getNomeBase() {
        return nomeBase;
    }

    public void setNomeBase(String nomeBase) {
        this.nomeBase = nomeBase;
    }
    public List<EstadoSigla> carregarAtributos() {
        return Arrays.asList(EstadoSigla.values());
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

    public String getUF() {
        return UF;
    }

    public void setUF(String uF) {
        UF = uF;
    }


}