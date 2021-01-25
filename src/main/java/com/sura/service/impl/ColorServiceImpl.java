package com.sura.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sura.dao.ColorDao;
import com.sura.modelo.Color;
import com.sura.modelo.RequestColor;
import com.sura.modelo.Response;
import com.sura.modelo.ResponseColor;
import com.sura.service.ColorService;

@Service
public class ColorServiceImpl implements ColorService{

	@Autowired
	ColorDao colorDao;
	
	@Override
	public Response crearColor(RequestColor requestColor) {
		
		Color color=new Color();
		
		color.setName(requestColor.getName());
		color.setColor(requestColor.getColor());
		color.setPantone(requestColor.getPantone());
		color.setYear(requestColor.getYear());
		
		Response responseCliente=new Response();
		color= colorDao.save(color);
		
		if (color.equals(null)) {
			responseCliente.setCodigo(1);
			responseCliente.setMensaje("Ok");;
		}
		
		return responseCliente;
	}

	@Override
	public ResponseColor listarColores(int ini, int fin) {
		// TODO Auto-generated method stub
		
		ResponseColor ResponseColor = new ResponseColor();
		ResponseColor.setColor((ArrayList<Color>) colorDao.listarColores(ini, fin, null));
		ResponseColor.setCodigo("1");
		ResponseColor.setMensaje("Ok");
		
		return ResponseColor;
	}

	@Override
	public ResponseColor listarColorPorId(int id) {
		// TODO Auto-generated method stub
		
		ResponseColor ResponseColor = new ResponseColor();
		ResponseColor.setColor((ArrayList<Color>) colorDao.listarColores(null, null, id));
		ResponseColor.setCodigo("1");
		ResponseColor.setMensaje("Ok");
		
		return ResponseColor;
	}


	@Override
	public Response eliminarColor(int id) {
		// TODO Auto-generated method stub
		
		Response response=new  Response();
		colorDao.deleteById( id);
		response.setMensaje("Ok");
		
		return response;
	}

	@Override
	public Response modificarColor(RequestColor requestColor, int id) {
		// TODO Auto-generated method stub

		Color color=new Color();
		color.setId(id);		
		color.setName(requestColor.getName());
		color.setColor(requestColor.getColor());
		color.setPantone(requestColor.getPantone());
		color.setYear(requestColor.getYear());
		
		Response responseCliente=new Response();
		color= colorDao.save(color);
		
		if (color.equals(null)) {
			responseCliente.setCodigo(1);
			responseCliente.setMensaje("Ok");;
		}
		
		return responseCliente;
	}
	
}
