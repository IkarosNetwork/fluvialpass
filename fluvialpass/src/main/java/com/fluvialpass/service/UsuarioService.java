package com.fluvialpass.service;

import java.util.List;

import org.hibernate.SessionFactory;

import com.fluvialpass.model.Usuario;

public class UsuarioService implements UsuarioServiceImpl {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public boolean createUsuario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editUsuario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUsuario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Usuario> listaUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
