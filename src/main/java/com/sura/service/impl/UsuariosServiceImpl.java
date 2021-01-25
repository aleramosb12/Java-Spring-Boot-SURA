package com.sura.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sura.dao.UsuariosDao;
import com.sura.modelo.Usuarios;
import com.sura.modelo.RequestUsuarios;
import com.sura.modelo.Response;
import com.sura.modelo.ResponseUsuarios;
import com.sura.service.UsuariosService;

@Service
public class UsuariosServiceImpl implements UsuariosService{

	@Autowired
	UsuariosDao usuariosDao;
	
	@Override
	public Response crearUsuarios(RequestUsuarios requestUsuarios) {
				
		Usuarios usuarios=new Usuarios();
		usuarios.setUsuario(requestUsuarios.getUsuario());
		usuarios.setContrasena(requestUsuarios.getContrasena());
		usuarios.setPerfil(requestUsuarios.getIdPerfil());
		
		Response responseCliente=new Response();
		usuarios= usuariosDao.save(usuarios);
		
		if (usuarios.equals(null)) {
			responseCliente.setCodigo(1);
			responseCliente.setMensaje("Ok");;
		}
		
		return responseCliente;
	}

	@Override
	public ResponseUsuarios listarUsuarios() {
		// TODO Auto-generated method stub
		
		ResponseUsuarios ResponseUsuarios = new ResponseUsuarios();
		ResponseUsuarios.setUsuarios((ArrayList<Usuarios>) usuariosDao.findAll());
		ResponseUsuarios.setCodigo("1");
		ResponseUsuarios.setMensaje("Ok");
		
		return ResponseUsuarios;
	}

	@Override
	public ResponseUsuarios listarUsuariosPorId(String id) {
		// TODO Auto-generated method stub
		
		ResponseUsuarios ResponseUsuarios = new ResponseUsuarios();
		ResponseUsuarios.setUsuarios((ArrayList<Usuarios>) usuariosDao.findAll());
		ResponseUsuarios.setCodigo("1");
		ResponseUsuarios.setMensaje("Ok");
		
		return ResponseUsuarios;
	}


	@Override
	public Response eliminarUsuarios(String id) {
		// TODO Auto-generated method stub
		Usuarios usuario=new Usuarios();
		usuario.setUsuario(id);
		Response response=new  Response();
		usuariosDao.delete(usuario);
		response.setMensaje("Ok");
		
		return response;
	}

	@Override
	public Response modificarUsuarios(RequestUsuarios requestUsuarios, String id) {
		// TODO Auto-generated method stub

		Usuarios usuarios=new Usuarios();
		usuarios.setUsuario(id);
		usuarios.setContrasena(requestUsuarios.getContrasena());
		usuarios.setPerfil(requestUsuarios.getIdPerfil());
		
		Response responseCliente=new Response();
		usuarios= usuariosDao.save(usuarios);
		
		if (usuarios.equals(null)) {
			responseCliente.setCodigo(1);
			responseCliente.setMensaje("Ok");;
		}
		
		return responseCliente;
	}
	
}
