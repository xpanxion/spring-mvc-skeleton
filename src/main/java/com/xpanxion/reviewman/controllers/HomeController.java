/**
 * 
 */
package com.xpanxion.reviewman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author brian
 *
 */
@Controller
public class HomeController {

	@RequestMapping("**/home")
	public ModelAndView getHomePage(){
		return new ModelAndView("home");
	}
	
}
