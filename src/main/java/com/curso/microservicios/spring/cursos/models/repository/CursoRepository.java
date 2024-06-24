package com.curso.microservicios.spring.cursos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.curso.microservicios.spring.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

}
