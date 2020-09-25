package com.javatechie.spring.mysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.mysql.api.dao.EmpleadoDao;
import com.javatechie.spring.mysql.api.dao.TicketDao;
import com.javatechie.spring.mysql.api.model.Empleado;
import com.javatechie.spring.mysql.api.model.Ticket;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	private EmpleadoDao dao;

	@PostMapping("/guardaEmpleados")
	public String guardarEmpleados(@RequestBody List<Empleado> empleados) {
		dao.save(empleados);
		return "Empleados Creados : " + empleados.size();
	}
	
	@GetMapping("/getEmpleados")
	public List<Empleado> getEmpleados() {
		Object o = dao.findAll();
		return (List<Empleado>) dao.findAll();
	}
	
	@GetMapping("/getEmpleadoId")
	public Empleado getEmpleadoId(@RequestParam  Long id) {
		Object o = dao.findOne(id);
		return (Empleado) o;
	}
	
	@GetMapping("/getEliminaEmpleadoId")
	public String getEliminaEmpleadoId(@RequestParam  Long id) {
		dao.delete(dao.findOne(id));
		return "registro Eliminado";
	}

}
