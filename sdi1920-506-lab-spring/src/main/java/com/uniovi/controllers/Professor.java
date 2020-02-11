package com.uniovi.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Professor {

	@RequestMapping("/professor/add")
	public String setMark() {
		return "Adding Professor";
	}

	@RequestMapping(value = "/professor/add", method = RequestMethod.POST)
	public String setMark(@RequestParam String nombre, @RequestParam String apellidos, @RequestParam String categoria,
			@RequestParam int dni) {
		//marksService.addMark(mark);
		return "añadido: "+nombre+apellidos+dni+categoria;
	}

	@RequestMapping(value = "/professor/edit/{id}")
	public String getEdit(Model model, @PathVariable Long id) {
		//model.addAttribute("mark", marksService.getMark(id));
		return "professor/edit";
	}

	@RequestMapping("/professor/details/{id}")
	public String getDetail(@PathVariable Long id) {
		return " Getting Detail: " + id;
	}

	@RequestMapping("/professor/delete/{id}")
	public String deleteMark(@PathVariable long id) {
		//marksService.deleteMark(id);
		return "ok";
	}

}
