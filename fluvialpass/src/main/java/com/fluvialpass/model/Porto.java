package com.fluvialpass.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Porto {
	
	@Id
	private Long idPorto;
	
	private String nomePorto;
	private String cidade;
}
