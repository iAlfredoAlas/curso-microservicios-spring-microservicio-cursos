package com.curso.microservicios.spring.cursos.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.curso.microservicios.spring.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

	@Query("select cur from Curso cur join fetch cur.alumnos alu where alu.id=?1")
	public Curso findCursoByAlumnoId(Long id);
	
}
