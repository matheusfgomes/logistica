package com.logistica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "remetente")
@JsonInclude(Include.NON_NULL)
public class Remetente {
	private static final long serialVersionUID = 5458313184231L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_remetente")
	private Long idRemetente;
	private Long cpfCnpj;
	private String nomeDestinatario;
	private String cgcRemetente;
	@OneToOne()
	private Tarefa tarefa;

	public Long getIdRemetente() {
		return idRemetente;
	}

	public void setIdRemetente(Long idRemetente) {
		this.idRemetente = idRemetente;
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

	public String getCgcRemetente() {
		return cgcRemetente;
	}

	public void setCgcRemetente(String cgcRemetente) {
		this.cgcRemetente = cgcRemetente;
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
