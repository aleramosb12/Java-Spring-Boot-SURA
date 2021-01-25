package com.sura.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sura.modelo.Usuarios;
import com.sura.modelo.Color;

public interface UsuariosDao extends CrudRepository<Usuarios, Integer> {
	

}
