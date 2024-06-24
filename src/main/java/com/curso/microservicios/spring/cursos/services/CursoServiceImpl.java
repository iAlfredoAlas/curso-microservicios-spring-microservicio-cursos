package com.curso.microservicios.spring.cursos.services;

import org.springframework.stereotype.Service;

import com.curso.microservicios.spring.commons.services.CommonServiceImpl;
import com.curso.microservicios.spring.cursos.models.entity.Curso;
import com.curso.microservicios.spring.cursos.models.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

}
