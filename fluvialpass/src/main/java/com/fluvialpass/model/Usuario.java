package com.fluvialpass.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idUsuario;
	
	private String nomeUsuario;
	private String idade;
	
	private long idTipoUsuario;
	
	private String telefone;
	private String email;
	
	private String login;
	private String senha;

}
