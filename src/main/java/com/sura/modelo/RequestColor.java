package com.sura.modelo;

import java.util.Date;

public class RequestColor {
	
	private  String name;
	private  String color;
	private  String Pantone;
	private  int year;
	
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
