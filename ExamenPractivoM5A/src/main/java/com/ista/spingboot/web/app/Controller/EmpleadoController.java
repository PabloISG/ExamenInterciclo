package com.ista.spingboot.web.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.spingboot.web.app.Services.IEmpleadoServices;
import com.ista.spingboot.web.app.entity.empleado;

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EmpleadoController {

	
	@Autowired
	private IEmpleadoServices empleadoServices;
	
	@GetMapping("/listarEmpleados")
	public List<empleado> index(){
		return empleadoServices.findAll();
	}
	
	@PostMapping("/guardarEmpleado")
	@ResponseStatus(HttpStatus.CREATED)
	public empleado create(@RequestBody empleado emp) {
		return empleadoServices.save(emp);
	}
	
	@GetMapping("/buscarEmpleado/{id}")
	public empleado show(@PathVariable Integer id) {
		return empleadoServices.findById(id);
	}
	
	@DeleteMapping("/eliminarEmpleado/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		empleadoServices.delete(id);
	}
	@PutMapping("/editarEmpleado/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public empleado update(@RequestBody empleado emp, @PathVariable Integer id) {
		empleado empactual=empleadoServices.findById(id);
		empactual.setNombre(emp.getNombre());
		empactual.setApellido(emp.getApellido());
		empactual.setTelefono(emp.getTelefono());
		empactual.setDireccion(emp.getDireccion());
		empactual.setFecha_nacimiento(emp.getFecha_nacimiento());
		empactual.setObservaciones(emp.getObservaciones());
		empactual.setDias_trabajo(emp.getDias_trabajo());
		empactual.setSueldo(emp.getSueldo());
		
		return empleadoServices.save(empactual);
		
	}
	
}
