package com.uniovi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uniovi.entities.Mark;
import com.uniovi.entities.Professor;
import com.uniovi.repositories.ProfessorRepository;

public class professorService {
	@Autowired
	private ProfessorRepository professorRepository;

	public List<Professor> getProfessors() {
		List<Professor> pro = new ArrayList<Professor>();
		professorRepository.findAll().forEach(pro::add);
		return pro;
	}

	public Professor getProfessor(Long dni) {
		return professorRepository.findById(dni).get();
	}

	public void addprofessor(Professor pro) {
		// Si en Id es null le asignamos el ultimo + 1 de la lista
		professorRepository.save(pro);
	}

	public void deleteProfessor(Long dni) {
		professorRepository.deleteById(dni);
	}
}
