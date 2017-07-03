package com.fluvialpass.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;

import com.fluvialpass.model.Barco;

public class BarcoDao implements BarcoDaoImpl {
	
	//Gerencia as sessões
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public boolean insertBarco(Barco barco) {
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
