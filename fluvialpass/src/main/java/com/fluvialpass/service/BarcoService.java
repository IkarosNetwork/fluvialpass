package com.fluvialpass.service;

import java.util.List;

import com.fluvialpass.model.Barco;
import com.fluvialpass.model.dao.BarcoDao;

public class BarcoService implements BarcoServiceImpl {
	
	private BarcoDao barcoDao;
	
	public void setBarcoDao(BarcoDao barcoDao){
		this.barcoDao = barcoDao;
	}
	
	@Override
	public boolean createBarco(Barco barco) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editBarco(Barco barco) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBarco(Barco barco) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean selectTodosBarcos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Barco> listabarcos() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
