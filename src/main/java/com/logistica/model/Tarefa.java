package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Tarefa
 */
@Entity
@Table(name = "tarefa")
@JsonInclude(Include.NON_NULL)
public class Tarefa implements Serializable, Registro {

	private static final long serialVersionUID = 13131541L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne()
	private Destinatario destinatario;
	@OneToOne()
	private Remetente remetente;
	@OneToOne()
	private Rota rota;
	@OneToOne()
	private Carga carga;
	@ManyToOne()
	@JoinColumn(name = "viagem_id")
	private Viagem viagem;
	@OneToOne()
	private Motorista motorista;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate previsaoEntrega;

	private LocalDate alteradoEm;
	private String alteradoPor;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate criandoEm;
	private String criadoPor;

	public Integer getIdTarefa() {
		return id;
	}

	public void setIdTarefa(final Integer idTarefa) {
		this.id = idTarefa;
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(final Viagem viagem) {
		this.viagem = viagem;
	}

	public Rota getRota() {
		return rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public Remetente getRemetente() {
		return remetente;
	}

	public void setRemetente(Remetente remetente) {
		this.remetente = remetente;
	}

	

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public LocalDate getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(final LocalDate previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
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