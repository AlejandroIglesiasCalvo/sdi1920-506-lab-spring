package com.uniovi.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.uniovi.entities.*;

@RestController
public class ProfessorController {

	@RequestMapping("/professor/add")
	public String setProfessor() {
		return "Adding Professor";
	}

	@RequestMapping(value = "/professor/add", method = RequestMethod.POST)
	public String setProfessor(@ModelAttribute Professor professor) {
		return "Añadido: " + professor.getApellidos() + professor.getNombre() + professor.getCategoria()
				+ professor.getDni();

	}

	@RequestMapping(value = "/professor/edit/{id}")
	public String getEdit(Model model, @PathVariable Long id) {
		// model.addAttribute("mark", marksService.getMark(id));
		return "professor/edit";
	}

	@RequestMapping("/professor/details/{id}")
	public String getDetail(@PathVariable Long id) {
		return " Getting Detail: " + id;
	}

	@RequestMapping("/professor/delete/{id}")
	public String deleteProfessor(@PathVariable long id) {
		// marksService.deleteMark(id);
		return "ok";
	}

}
