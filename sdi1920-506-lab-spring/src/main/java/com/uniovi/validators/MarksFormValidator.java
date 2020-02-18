package com.uniovi.validators;

import org.springframework.beans.factory.annotation.Autowired;

import com.uniovi.entities.Mark;
import com.uniovi.entities.User;
import com.uniovi.services.MarksService;

public class MarksFormValidator {

	@Autowired
	private MarksService marksService;



	public boolean validate(Mark target) {
		boolean res=false;
		if(target.getScore()>=0&&target.getScore()<=10) {
			res=true;
		}
		return res;
	}
}
