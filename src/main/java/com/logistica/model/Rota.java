package com.logistica.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "rota")
@JsonInclude(Include.NON_NULL)
public class Rota implements Serializable, Registro {

	private static final long serialVersionUID = 54581584231L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRota;
	private String enderecoEntrega;
	private String numero;
	private Integer cep;
	private String latitude;
	private String longitude;

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
