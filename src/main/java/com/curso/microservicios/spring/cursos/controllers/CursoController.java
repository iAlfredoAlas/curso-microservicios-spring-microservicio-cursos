package com.curso.microservicios.spring.cursos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservicios.spring.commons.controllers.CommonController;
import com.curso.microservicios.spring.cursos.models.entity.Curso;
import com.curso.microservicios.spring.cursos.services.CursoService;
import com.curso.microservicios.spring.generic.alumnos.models.entity.Alumno;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable Long id) {
		Optional<Curso> optCurso = this.service.findbyId(id);
		if (optCurso.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Curso dbCurso = optCurso.get();
		dbCurso.setNombre(curso.toString());
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbCurso));
	}

	@PutMapping("/{id}/asignar-alumnos")
	public ResponseEntity<?> asignarAlumnos(@RequestBody List<Alumno> alumnos, @PathVariable Long id) {
		Optional<Curso> optCurso = this.service.findbyId(id);
		if (optCurso.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Curso dbCurso = optCurso.get();
		alumnos.forEach(alumno -> {
			dbCurso.addAlumnos(alumno);
		});
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbCurso));
	}
	
	@PutMapping("/{id}/eliminar-alumno")
	public ResponseEntity<?> c(@RequestBody Alumno alumno, @PathVariable Long id) {
		Optional<Curso> optCurso = this.service.findbyId(id);
		if (optCurso.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Curso dbCurso = optCurso.get();
		dbCurso.removeAlumnos(alumno);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.service.save(dbCurso));
	}

}
