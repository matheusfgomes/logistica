package com.logistica.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Veiculo
 */
@Getter
@Setter
@Entity(name = "veiculo")
public class Veiculo implements Serializable, Registro {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeiculo;
    private String cidade;
    @Column(unique = true)
    private String placa;
    private String uf;
    @Enumerated(EnumType.STRING)
    private CorVeiculo corVeiculo;
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;
    @Enumerated(EnumType.STRING)
    private StatusVeiculo statusVeiculo = StatusVeiculo.DISPONIVEL;
    @ManyToOne
    @JoinColumn(name = "base_id")
    @JsonBackReference
    private Base base;
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

    @JsonIgnore
    @Override
    public Usuario getUsuario() {
        Usuario usua = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return usua;

    }

}
