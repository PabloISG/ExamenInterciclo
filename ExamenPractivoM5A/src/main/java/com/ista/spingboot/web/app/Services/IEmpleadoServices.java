package com.ista.spingboot.web.app.Services;

import java.util.List;

import com.ista.spingboot.web.app.entity.*;

public interface IEmpleadoServices {

public List<empleado> findAll();
	
	public empleado save(empleado emp);
	
	public empleado findById(Integer id);
	
	public void delete (Integer id);
	
}
