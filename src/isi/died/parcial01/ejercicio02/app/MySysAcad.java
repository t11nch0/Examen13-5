package isi.died.parcial01.ejercicio02.app;

import isi.died.parcial01.ejercicio02.db.NoPoseeIncripcionRegularException;
import isi.died.parcial01.ejercicio02.dominio.*;

import java.util.List;


public interface MySysAcad {
	
	public void registrarMateria(Materia d);
	
	
	public void registrarDocente(Docente d) ;
	
	
	public void registrarAlumnos(Alumno d);
	/**
	 * crea una nueva instancia de Inscripcion y 
	 * asigna la inscripcion a la lista de inscripciones del alumno, 
	 * de la materia y del docente
	 */
	public void inscribirAlumnoCursada(Docente d,Alumno a, Materia m,Integer cicloLectivo) throws NoPoseeIncripcionRegularException;

	/**
	 * crea una nueva instancia de Inscripcion y 
	 * asigna la inscripcion a la lista de inscripciones del alumno, 
	 * de la materia y del docente
	 */
	public void inscribirAlumnoExamen(Docente d,Alumno a, Materia m);

	public List<Examen> topNExamenes(Alumno a, Integer nota, Integer n);
	

}
