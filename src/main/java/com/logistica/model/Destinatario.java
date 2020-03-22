package com.logistica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "destinatario")
@JsonInclude(Include.NON_NULL)
public class Destinatario {
	
	private static final long serialVersionUID = 54581584231L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long cpfCnpj;
	private String nomeDestinatario;
	private String cgcDestinatario;
	@OneToOne()
	private Tarefa tarefa;

	public Long getIdDestinatario() {
		return id;
	}

	public void setIdDestinatario(Long idDestinatario) {
		this.id = idDestinatario;
	}

	public Long getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(Long cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	public String getCgcDestinatario() {
		return cgcDestinatario;
	}

	public void setCgcDestinatario(String cgcDestinatario) {
		this.cgcDestinatario = cgcDestinatario;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
