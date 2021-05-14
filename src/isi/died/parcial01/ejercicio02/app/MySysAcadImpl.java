package isi.died.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import isi.died.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died.parcial01.ejercicio02.db.NoPoseeIncripcionRegularException;
import isi.died.parcial01.ejercicio02.dominio.*;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) throws NoPoseeIncripcionRegularException{
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		// DESCOMENTAR Y gestionar excepcion
		try{
			DB.guardar(insc);

		}catch(BaseDeDatosExcepcion e){

			throw new NoPoseeIncripcionRegularException();
		}

	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(e);
	}

	@Override
	public List<Examen> topNExamenes(Alumno a, Integer nota, Integer n) {
		//a.getExamenes().stream().filter((variable)-> variable.getNota()>=nota).sorted(Comparator.comparing(Examen::getNota)).collect;
		return null;
	}

	public void registrarNota(Integer nota, Examen e){
		e.setNota(nota);
		if(nota>=6){
			Inscripcion nuevo= e.getAlumno().getMateriasCursadas().stream().max(Comparator.comparing(Inscripcion::getCicloLectivo)).get();
			nuevo.setEstado(Inscripcion.Estado.PROMOCIONADO);
		}


	}

}
