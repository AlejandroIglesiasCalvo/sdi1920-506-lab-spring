package com.uniovi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.uniovi.entities.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {
	@Query("SELECT r FROM Professor r WHERE (LOWER(r.name) LIKE LOWER(?1) OR LOWER(r.lastName) LIKE LOWER(?1))")
	List<Professor> searchByDescriptionAndName(String seachtext);

}
