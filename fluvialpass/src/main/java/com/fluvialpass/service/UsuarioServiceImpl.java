package com.fluvialpass.service;

import java.util.List;

import com.fluvialpass.model.Usuario;


public interface UsuarioServiceImpl {
	
	public boolean createUsuario();
	
	public boolean editUsuario();
	
	public boolean deleteUsuario();
	
	public List<Usuario> listaUsuarios();

}
