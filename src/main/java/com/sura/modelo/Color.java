package com.sura.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Colores")

public class Color {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private  int id;
	private  String name;
	private  String color;
	private  String Pantone;
	private  int year;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPantone() {
		return Pantone;
	}
	public void setPantone(String pantone) {
		Pantone = pantone;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
}
