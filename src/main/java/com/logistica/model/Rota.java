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
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "rota")
@JsonInclude(Include.NON_NULL)
public class Rota implements Serializable, Registro {

	private static final long serialVersionUID = 54581584231L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String enderecoEntrega;
	@NotBlank
	private String bairro;
	@NotBlank
	private String numero;
	@NotBlank
	private Integer cep;
	@NotBlank
	private String latitude;
	@NotBlank
	private String longitude;
	@OneToOne()
	@JoinColumn(name = "tarefa_id")
	private Tarefa tarefa;

	@Override
	public String getCriadoPor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCriadoPor(String criadoPor) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlteradoPor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAlteradoPor(String alteradoPor) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDate getCriadoEm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCriadoEm(LocalDate date) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAlteradoEm(LocalDate date) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDate getAlteradoEm() {
		// TODO Auto-generated method stub
		return null;
	}

}
