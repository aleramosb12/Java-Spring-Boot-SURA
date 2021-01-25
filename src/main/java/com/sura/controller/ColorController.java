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
import com.sura.service.ColorService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ColorController {

	@Autowired
	ColorService colorService;



	@GetMapping("/colores")
	@ApiOperation(value = "Listado de clientes", notes = "Obtiene los datos de clientes y la fecha probable de muerte")
	public ResponseColor listarColores(
			@RequestParam int ini,
			@RequestParam int fin) {

		return colorService.listarColores(ini,fin);
	}
	
	@GetMapping("/colores/{id}")
	@ApiOperation(value = "Listado de clientes", notes = "Obtiene los datos de clientes y la fecha probable de muerte")
	public ResponseColor listarColorPorId(@PathVariable int id) {

		return colorService.listarColorPorId(id);
	}
	
	
	@PostMapping("/colores")
	@ApiOperation(value = "Operacion de insercion", notes = "Guarda los clientes que se registren en la API")
	public Response crearColor(@RequestBody RequestColor requestColor) {

		return colorService.crearColor(requestColor);
	}
	
	@PutMapping("/colores/{id}")
	@ApiOperation(value = "Operacion de insercion", notes = "Guarda los clientes que se registren en la API")
	public Response modificarColor(@PathVariable int id,@RequestBody RequestColor requestColor) {

		return colorService.modificarColor(requestColor, id);
	}
	
	@DeleteMapping("/colores/{id}")
	@ApiOperation(value = "Operacion de insercion", notes = "Guarda los clientes que se registren en la API")
	public Response eliminarColor(@PathVariable int id) {

		return colorService.eliminarColor(id);
	}

}
