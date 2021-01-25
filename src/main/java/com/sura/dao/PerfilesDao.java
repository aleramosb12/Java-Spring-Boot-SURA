package com.sura.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sura.modelo.Color;
import com.sura.modelo.Perfiles;

public interface PerfilesDao extends CrudRepository<Perfiles, Integer> {

	

}
