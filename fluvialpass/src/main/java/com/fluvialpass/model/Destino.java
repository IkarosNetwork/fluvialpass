package com.fluvialpass.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Destino implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idDestino;
	
	private String nomeDestino;
	private float valorPassagem;
	private float valorPassagemCrianca0_3anos;
	private float valorPassagemCrianca3_12anos;
	
	
	private Long idCidade;
	
	
	private Long idPorto;

}
