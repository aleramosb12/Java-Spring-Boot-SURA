package com.sura.modelo;

import java.util.ArrayList;


public class ResponseUsuarios {
	
	private ArrayList<Usuarios> usuarios;
	private String codigo;
	private String mensaje;
	public ArrayList<Usuarios> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

	
}
