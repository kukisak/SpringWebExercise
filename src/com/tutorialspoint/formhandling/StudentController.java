package com.tutorialspoint.formhandling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	/**
	 * This Service method create blank ModelAndView object of type Student which is named
	 * "command". The name command is necessary here because of using <form:form> tag
	 * in jsp files.
	 * @return Blank student object named command
	 */
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView student()
	{
		return new ModelAndView("student", "command", new Student());
	}

	/**
	 * This service method add new student
	 * @param student New student from user input
	 * @param model Model to view
	 * @return Name of view to render built model 
	 */
	@RequestMapping(value= "/addStudent", method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model)
	{
		model.addAttribute("id", student.getId());
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		
		return "result";
	}
}
