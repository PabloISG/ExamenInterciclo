package com.ista.spingboot.web.app.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ista.spingboot.web.app.Repository.EmpleadoRepository;
import com.ista.spingboot.web.app.entity.empleado;

public class EmpleadoServicesImpl implements IEmpleadoServices{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	@Transactional (readOnly = true)
	public List<empleado> findAll() {
		return (List<empleado>)empleadoRepository.findAll();
	}

	@Override
	public empleado save(empleado emp) {
		return empleadoRepository.save(emp);
	}

	@Override
	public empleado findById(Integer id) {
		return empleadoRepository.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		empleadoRepository.deleteById(id);
		
	}

}
