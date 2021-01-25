package com.sura.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sura.modelo.RequestColor;
import com.sura.modelo.Response;
import com.sura.modelo.ResponseColor;
import com.sura.modelo.ResponsePerfiles;
import com.sura.service.ColorService;
import com.sura.service.PerfilesService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class PerfilesController {

	@Autowired
	PerfilesService perfilesService;



	@GetMapping("/perfiles")
	@ApiOperation(value = "Listado de clientes", notes = "Obtiene los datos de clientes y la fecha probable de muerte")
	public ResponsePerfiles listarperfiles() {

		return perfilesService.listarPerfiles();
	}


}
