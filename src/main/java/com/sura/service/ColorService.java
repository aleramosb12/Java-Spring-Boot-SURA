package com.sura.service;


import com.sura.modelo.RequestColor;
import com.sura.modelo.Response;
import com.sura.modelo.ResponseColor;

public interface ColorService {
	
	public Response crearColor(RequestColor requestColor);
	public ResponseColor listarColores(int ini, int fin);
	public ResponseColor listarColorPorId(int id); 
	public Response modificarColor(RequestColor requestColor, int id);
	public Response eliminarColor(int requestColor);

	

	
	

}
