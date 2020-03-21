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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Base
 * 
 * @see
 */
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
	private LocalDate alteradoEm;
	private String alteradoPor;
	private LocalDate criandoEm;
	private String criadoPor;
	private Base base;

	public Long getIdBase() {
		return idBase;
	}

	public void setIdBase(final Long idBase) {
		this.idBase = idBase;
	}

	public Long getCodBase() {
		return codBase;
	}

	public void setCodBase(final Long codBase) {
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

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String altitude) {
		this.longitude = altitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getElevacao() {
		return elevacao;
	}

	public void setElevacao(String elevacao) {
		this.elevacao = elevacao;
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

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Base [idBase=" + idBase + ", nomeBase=" + nomeBase + ", codBase=" + codBase + ", cidade=" + cidade
				+ ", UF=" + UF + ", criandoEm=" + criandoEm + "]";
	}

}