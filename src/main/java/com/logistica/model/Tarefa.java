package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Tarefa
 */
@Getter
@Setter
@Entity
@Table(name = "tarefa")
@JsonInclude(Include.NON_NULL)
public class Tarefa implements Serializable, Registro {

	private static final long serialVersionUID = 13131541L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToMany(mappedBy = "tarefa")
	private List<Carga> cargas;
	@ManyToOne
	@JoinColumn(name = "id_viagem")
	private Viagem viagem;
	@ManyToOne()
	@JoinColumn(name = "id_motorista")
	private Motorista motorista;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate previsaoEntrega;
	private LocalDate alteradoEm;
	private String alteradoPor;
	@JsonFormat(pattern = "dd/MM/yyyy")
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
