package com.sura.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sura.modelo.Usuarios;
import com.sura.modelo.Color;

public interface ColorDao extends CrudRepository<Color, Integer> {
	
	@Query(value = "CALL PROC_LISTAR_COLORES_POR_ID_RANGO(:ini,:fin,:idIn);", nativeQuery = true)
	List<Color> listarColores(@Param("ini") Integer ini, @Param("fin") Integer fin, @Param("idIn") Integer id);
	
	
}
