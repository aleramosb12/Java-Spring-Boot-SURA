package com.sura.modelo;

import java.util.ArrayList;


public class ResponseColor {
	
	private ArrayList<Color> colores;
	private String codigo;
	private String mensaje;
	

	public ArrayList<Color> getColores() {
		return colores;
	}


	public void setColores(ArrayList<Color> colores) {
		this.colores = colores;
	}


	public void setColor(ArrayList<Color> colores) {
		this.colores = colores;
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
