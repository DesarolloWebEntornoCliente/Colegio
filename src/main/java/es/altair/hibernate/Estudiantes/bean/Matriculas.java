package es.altair.hibernate.Estudiantes.bean;

import java.io.Serializable;

public class Matriculas implements Serializable{

	private int idMatricula;
	private int idEstudiante;
	private int idClase;
	
	public Matriculas() {
		super();
	}

	public Matriculas(int idMatricula, int idEstudiante, int idClase) {
		super();
		this.idMatricula = idMatricula;
		this.idEstudiante = idEstudiante;
		this.idClase = idClase;
	}

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public int getIdClase() {
		return idClase;
	}

	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}
	
	
	
}
