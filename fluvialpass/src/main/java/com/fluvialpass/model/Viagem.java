package com.fluvialpass.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Viagem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idViagem;
	
	private Calendar dataSaida;
	
	private Calendar dataChegada;
	
	private String horaSaida;
	private String horaChegada;
	
	private Long idBarco;
	
	private Long idItinerario;

}
