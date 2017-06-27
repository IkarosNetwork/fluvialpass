package com.fluvialpass.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Destino {
	
	@Id
	private Long idDestino;
	
	private String nomeDestino;
	private float valorPassagem;
	private float valorPassagemCrianca0_3anos;
	private float valorPassagemCrianca3_12anos;
	
	private String cidade;
	private String porto;
}
