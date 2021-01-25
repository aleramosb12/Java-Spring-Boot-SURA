package com.sura.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sura.dao.PerfilesDao;
import com.sura.modelo.Perfiles;
import com.sura.modelo.RequestPerfiles;
import com.sura.modelo.Response;
import com.sura.modelo.ResponsePerfiles;
import com.sura.service.PerfilesService;

@Service
public class PerfilesServiceImpl implements PerfilesService{

	@Autowired
	PerfilesDao perfilesDao;
	
	

	@Override
	public ResponsePerfiles listarPerfiles() {
		// TODO Auto-generated method stub
		
		ResponsePerfiles ResponsePerfiles = new ResponsePerfiles();
		ResponsePerfiles.setPerfiles((ArrayList<Perfiles>) perfilesDao.findAll());
		ResponsePerfiles.setCodigo("1");
		ResponsePerfiles.setMensaje("Ok");
		
		return ResponsePerfiles;
	}





	
}
