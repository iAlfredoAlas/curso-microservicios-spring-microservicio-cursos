package com.curso.microservicios.spring.cursos.services;

import com.curso.microservicios.spring.commons.services.CommonService;
import com.curso.microservicios.spring.cursos.models.entity.Curso;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);
	
}
