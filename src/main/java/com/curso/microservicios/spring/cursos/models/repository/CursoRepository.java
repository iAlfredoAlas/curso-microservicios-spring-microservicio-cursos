package com.curso.microservicios.spring.cursos.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.curso.microservicios.spring.cursos.models.entity.Curso;

public interface CursoRepository extends PagingAndSortingRepository<Curso, Long> {

	@Query("select cur from Curso cur join fetch cur.alumnos alu where alu.id=?1")
	public Curso findCursoByAlumnoId(Long id);
	
}
