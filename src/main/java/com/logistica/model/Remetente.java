package com.logistica.model;

import javax.persistence.Column;
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
@Table(name = "remetente")
@JsonInclude(Include.NON_NULL)
public class Remetente {
    private static final long serialVersionUID = 5458313184231L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idRemetente;
    private String cpfCnpj;
    private String nomeDestinatario;
    private String cgcRemetente;
    private String endereco;
    @OneToOne(mappedBy = "remetente")
    private Rota rota;


}
