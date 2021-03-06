package com.andre.apifinancas.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="transacoes")
public class Transacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idTransacao;
    private String descricao;
    private Double valor;

    @ManyToOne
    @JoinColumn(name="idConta")
     private Conta conta;
    @ManyToOne
     private Categoria categoria;

     @Enumerated(EnumType.STRING)
     private TipoDeTransacao tipoDeTransacao;
    
}