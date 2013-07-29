package com.tutorialspoint.staticpages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticPagesController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index()
	{
		return "staticpageindex";
	}
	
	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String redirect()
	{
		return "redirect:pages/final.html";
	}
}
