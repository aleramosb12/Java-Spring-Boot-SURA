package com.sura.service;


import com.sura.modelo.RequestUsuarios;
import com.sura.modelo.Response;
import com.sura.modelo.ResponseUsuarios;

public interface UsuariosService {
	
	public Response crearUsuarios(RequestUsuarios requestUsuarios);
	public ResponseUsuarios listarUsuarios();
	public ResponseUsuarios listarUsuariosPorId(String id); 
	public Response modificarUsuarios(RequestUsuarios requestUsuarios, String id);
	public Response eliminarUsuarios(String requestUsuarios);

	

	
	

}
