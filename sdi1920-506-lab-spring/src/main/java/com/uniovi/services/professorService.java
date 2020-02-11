package com.uniovi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uniovi.entities.Mark;
import com.uniovi.repositories.ProfessorRepository;

public class professorService {
	@Autowired
	private ProfessorRepository professorRepository;

	public List<Mark> getMarks() {
		List<Mark> marks = new ArrayList<Mark>();
		professorRepository.findAll().forEach(marks::add);
		return marks;
	}

	public Mark getProfessor(Long id) {
		return professorRepository.findById(id).get();
	}

	public void addprofessor(Mark mark) {
		// Si en Id es null le asignamos el ultimo + 1 de la lista
		professorRepository.save(mark);
	}

	public void deleteProfessor(Long id) {
		professorRepository.deleteById(id);
	}
}
