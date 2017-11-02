package es.altair.hibernate.Estudiantes.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="estudiantes")
public class Estudiantes implements Serializable{

	@Id
	private int idEstudiante;
	private String nombre;
	private String apellidos;
	private int edad;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="matriculas", joinColumns = {@JoinColumn(name="idEstudiante")}, inverseJoinColumns = {@JoinColumn(name="idClase")})
	private Set<Clases> clases = new HashSet<Clases>();
	
	public Estudiantes() {
		super();
	}

	public Estudiantes(int idEstudiante, String nombre, String apellidos, int edad) {
		super();
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setClases(Set<Clases> clases) {
		this.clases = clases;
	}
	
	public Set<Clases> getClases() {
		return clases;
	}

	@Override
	public String toString() {
		return "Estudiantes [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}



}
