package com.tutorialspoint.exceptionhandling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

//	static Logger log = Logger.getLogger(StudentController.class.getName());
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student()
	{
//		log.info("Going to return new Student object");
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent(@ModelAttribute Student student, 
			ModelMap model)
	{
		if (student.getAge() < 10)
		{
			throw new SpringException("Given age is to low. Age have to be at least 10 years old.");
		}
		else
		{
			model.addAttribute("age", student.getAge());
		}
		if (student.getName().length() < 6)
		{
			throw new SpringException("Given name length is to low. Name length have to be at least 6 chars long.");
		}
		else
		{
			model.addAttribute("name", student.getName());
		}
		if (student.getId() == 1)
		{
			throw new RuntimeException("Given id is equal to 1.");
		}
		else
		{
			model.addAttribute("id", student.getId());
		}
//		log.info("Going to display student result");
		return "result";
	}
}
