package com.logistica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "destinatario")
@JsonInclude(Include.NON_NULL)
public class Destinatario {

    private static final long serialVersionUID = 54581584231L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpfCnpj;
    private String nomeDestinatario;
    private String cgcDestinatario;
    @OneToOne(mappedBy = "destinatario")
    private Rota rota;


}
