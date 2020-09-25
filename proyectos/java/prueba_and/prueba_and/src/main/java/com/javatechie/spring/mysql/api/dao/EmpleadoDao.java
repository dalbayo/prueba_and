package com.javatechie.spring.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatechie.spring.mysql.api.model.Empleado;

public interface EmpleadoDao extends CrudRepository<Empleado, Long>{

}
