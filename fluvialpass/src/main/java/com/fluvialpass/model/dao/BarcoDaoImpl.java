package com.fluvialpass.model.dao;

import java.util.List;

import com.fluvialpass.model.Barco;

public interface BarcoDaoImpl{
	
public boolean insertBarco(Barco barco);
	
	public boolean editBarco(Barco barco);
	
	public boolean deleteBarco(Barco barco);
	
	public boolean selectTodosBarcos();
	
	public List<Barco> listabarcos();
	
}
