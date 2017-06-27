package com.fluvialpass.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Viagem {
	
	@Id
	private Long idViagem;
	
	private Date dataSaida;
	private Date dataChegada;
	private String horaSaida;
	private String horaChegada;
	private String Barco;
	private String itinaerario;
}
