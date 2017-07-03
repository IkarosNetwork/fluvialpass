package com.fluvialpass.service;

import java.util.List;

import com.fluvialpass.model.Barco;

public interface BarcoServiceImpl {
	
	public boolean createBarco(Barco barco);
	
	public boolean editBarco(Barco barco);
	
	public boolean deleteBarco(Barco barco);
	
	public boolean selectTodosBarcos();
	
	public List<Barco> listabarcos();

}
