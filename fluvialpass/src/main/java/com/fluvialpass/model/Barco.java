package com.fluvialpass.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Barco {

		@Id
		private Long idBarco;
		
		private String nomeBarco;
		private String tipoBarco;
		private String destino;
		private String balsa;
		private String telefone;
		private int capacidadeLotação;
}
