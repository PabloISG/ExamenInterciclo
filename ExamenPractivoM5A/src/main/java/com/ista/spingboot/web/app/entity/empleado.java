package com.ista.spingboot.web.app.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Usuario")
public class empleado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="idEmpleado")
	 private Integer id_empleado;
	 
	 @Column(name = "nombre")
	 private String nombre;
	 
	 @Column(name = "apellido")
	 private String apellido;
	 
	 @Column(name = "contacto")
	 private String telefono;
	 
	 @Column(name = "direccion")
	 private String direccion;
	 
	 @Column(name = "fechaNacimiento")
	 //@Temporal(TemporalType.DATE)
	 private String fecha_nacimiento;
	 
	 @Column(name = "observaciones")
	 private String observaciones;
	 
	 @Column(name = "diasTrabajados")
	 private int dias_trabajo;
	 
	 @Column(name = "sueldo")
	 private double sueldo;

	public Integer getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getDias_trabajo() {
		return dias_trabajo;
	}

	public void setDias_trabajo(int dias_trabajo) {
		this.dias_trabajo = dias_trabajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	 
	 

}
