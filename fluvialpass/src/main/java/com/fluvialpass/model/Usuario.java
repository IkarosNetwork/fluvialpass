package com.fluvialpass.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

		@Id
		private Long idUsuario;
		
		private String nomeUsuario;
		private Date dataNasc;
		private int idade;
		private String endereco;
		private String telefone;
}
