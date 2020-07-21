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
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

/**
 * Motorista
 */
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
@Entity
@Table(name = "motorista")
public class Motorista implements Serializable, Registro {

	private static final long serialVersionUID = 31231317251L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String nome;
	@NotBlank
	private String cpf;
	@NotBlank
	private String categoriaCnh;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	@NotBlank
	private String celular;
	@ManyToOne()
	@JoinColumn(name = "id_base")
	private Base base;
	@OneToMany(mappedBy = "motorista")
	private List<Tarefa> tarefas;
	private String vinculoMotorista;
	private String senhaExpirada;
	private StatusMotorista statusMotorista;
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
		return "Motorista [id=" + id + ", base=" + base + ", nome=" + nome + ", cpf=" + cpf + ", categoriaCnh="
				+ categoriaCnh + ", dataNascimento=" + dataNascimento + ", celular=" + celular + ", criandoEm="
				+ criandoEm + "]";
	}

	
}