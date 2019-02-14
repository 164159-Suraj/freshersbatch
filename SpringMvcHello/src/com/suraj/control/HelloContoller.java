package com.suraj.control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
* author: Crunchify.com
* 
*/

@Controller
public class HelloContoller {

	@RequestMapping("/welcome")
	public ModelAndView hello() {

		ModelAndView model=new ModelAndView("HelloPage");
		model.addObject("msg", "Hello World!!!!!!!!!");
		return model;
	}
}
