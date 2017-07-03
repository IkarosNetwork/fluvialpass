package com.fluvialpass.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Barco implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idBarco;
	
	private String nomeBarco;
	private String telefone;
	private int capacidadeLotacao;
	
	private Long idTipoBarco;
	
	private Long idDestino;
	
	private Long idBalsa;

}
