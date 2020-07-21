package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

/**
 * Base
 * 
 * @see
 */
@Getter
@Setter
@Entity
@Table(name = "base")
@JsonInclude(Include.NON_NULL)
public class Base implements Serializable, Registro {
  
	private static final long serialVersionUID = 54581584231L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBase;
	@NotBlank
	private String nomeBase;
	private Long codBase;
	@NotBlank
	private String cidade;
	@NotBlank
	private String UF;
	@NotBlank
	private String longitude;
	@NotBlank
	private String latitude;
	private String elevacao;
	@OneToMany(mappedBy = "base")
	private List<Motorista>motoristas;
	@OneToMany(mappedBy = "base")
	private List<Veiculo> veiculos;
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
	public String toString() {
		return "Base [idBase=" + idBase + ", nomeBase=" + nomeBase + ", codBase=" + codBase + ", cidade=" + cidade
				+ ", UF=" + UF + ", criandoEm=" + criandoEm + "]";
	}

}