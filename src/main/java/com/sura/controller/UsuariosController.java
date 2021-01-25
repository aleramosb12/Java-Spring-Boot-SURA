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

import com.sura.modelo.RequestUsuarios;
import com.sura.modelo.Response;
import com.sura.modelo.ResponseUsuarios;
import com.sura.service.UsuariosService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class UsuariosController {

	@Autowired
	UsuariosService usuariosService;



	@GetMapping("/usuarios")
	@ApiOperation(value = "Listado de clientes", notes = "Obtiene los datos de clientes y la fecha probable de muerte")
	public ResponseUsuarios listarUsuarios() {

		return usuariosService.listarUsuarios();
	}
	
	@GetMapping("/usuarios/{id}")
	@ApiOperation(value = "Listado de clientes", notes = "Obtiene los datos de clientes y la fecha probable de muerte")
	public ResponseUsuarios listarUsuariosPorId(@PathVariable String id) {

		return usuariosService.listarUsuariosPorId(id);
	}
	
	
	@PostMapping("/usuarios")
	@ApiOperation(value = "Operacion de insercion", notes = "Guarda los clientes que se registren en la API")
	public Response crearusuarios(@RequestBody RequestUsuarios RequestUsuarios) {

		return usuariosService.crearUsuarios(RequestUsuarios);
	}
	
	@PutMapping("/usuarios/{id}")
	@ApiOperation(value = "Operacion de insercion", notes = "Guarda los clientes que se registren en la API")
	public Response modificarusuarios(@PathVariable String id,@RequestBody RequestUsuarios RequestUsuarios) {

		return usuariosService.modificarUsuarios(RequestUsuarios, id);
	}
	
	@DeleteMapping("/usuarios/{id}")
	@ApiOperation(value = "Operacion de insercion", notes = "Guarda los clientes que se registren en la API")
	public Response eliminarusuarios(@PathVariable String id) {

		return usuariosService.eliminarUsuarios(id);
	}

}
