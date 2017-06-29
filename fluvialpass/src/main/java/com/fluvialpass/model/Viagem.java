package com.fluvialpass.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Viagem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long idViagem;
	
	private Date dataSaida;
	private Date dataChegada;
	private String horaSaida;
	private String horaChegada;
	
	private Long idBarco;
	
	private Long idItinerario;

}
