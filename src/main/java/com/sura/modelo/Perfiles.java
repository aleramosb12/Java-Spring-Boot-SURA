package com.sura.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Perfiles")

public class Perfiles {
	
	@Id
	private int id;
	private String perfil;
	private String pestanas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getPestanas() {
		return pestanas;
	}
	public void setPestanas(String pestanas) {
		this.pestanas = pestanas;
	}
	
	
	

}
