package com.sura.modelo;

import java.util.ArrayList;


public class ResponsePerfiles {
	
	private ArrayList<Perfiles> perfiles;
	private String codigo;
	private String mensaje;
	public ArrayList<Perfiles> getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(ArrayList<Perfiles> perfiles) {
		this.perfiles = perfiles;
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
