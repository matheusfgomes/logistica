package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Carga
 */

@Entity
@Table(name = "carga")
@JsonInclude(Include.NON_NULL)
public class Carga implements Serializable, Registro {

	private static final long serialVersionUID = 5451234181584231L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCarga;
	private String notaFiscal;
	private Integer volumeCarga;
	private Double peso;
	@OneToOne
	@JoinColumn(name = "tarefa_id")
	private Tarefa tarefa;
	private LocalDate alteradoEm;
	private String alteradoPor;
	private LocalDate criandoEm;
	private String criadoPor;

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

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public LocalDate getCriandoEm() {
		return criandoEm;
	}

	public void setCriandoEm(LocalDate criandoEm) {
		this.criandoEm = criandoEm;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

}