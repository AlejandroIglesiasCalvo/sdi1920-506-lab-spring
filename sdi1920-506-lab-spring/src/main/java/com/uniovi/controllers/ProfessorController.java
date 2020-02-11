package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uniovi.entities.Professor;
import com.uniovi.services.professorService;

@Controller
public class ProfessorController {
	@Autowired // Inyectar el servicio
	private professorService professorService;

	@RequestMapping("/professor/add")
	public String setProfessor() {
		return "Adding Professor";
	}

	@RequestMapping(value = "/professor/add", method = RequestMethod.POST)
	public String setProfessor(@ModelAttribute Professor professor) {
		return "Añadido: " + professor.getApellidos() + professor.getNombre() + professor.getCategoria()
				+ professor.getDni();

	}

	@RequestMapping(value = "/professor/edit/{dni}")
	public String getEdit(Model model, @PathVariable Long dni) {
		// model.addAttribute("mark", marksService.getMark(id));
		return "professor/edit";
	}

	@RequestMapping("/professor/details/{id}")
	public String getDetail(@PathVariable Long dni) {
		return " Getting Detail: " + dni;
	}

	@RequestMapping("/professor/delete/{id}")
	public String deleteProfessor(@PathVariable long dni) {
		professorService.deleteProfessor(dni);
		return "redirect:/professor/list";
	}

	@RequestMapping("/professor/list")
	public String getList(Model model) {
		model.addAttribute("professorList", professorService.getProfessors());
		return "professor/list";
	}

}
