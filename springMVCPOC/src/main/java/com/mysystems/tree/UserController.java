/**
 * 
 */
package com.mysystems.tree;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysystems.tree.service.impl.TreeAdopterServiceImpl;
import com.mysystems.tree.service.impl.TreePlanterServiceImpl;

/**
 * @author gsin25
 *
 */
@Controller
public class UserController {
private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Welcome to userLogin! ");
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		logger.info(name);
		
		
				
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		if(name.equals("treePlanter")){
			  return "redirect:/app/plant";
		}
		
		if(name.equals("treeAdopter")){
			return "redirect:/app/adopt";
		}
		return "home";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(){
		logger.info("You are getting logged out");
		SecurityContextHolder.clearContext();
		return "logout";
		
	}

	
	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public String accessDenied(){
		logger.info("You have no access");
		return "accessDenied";
		
	}
	
	
	@RequestMapping(value = "/app/authenticationFailed", method = RequestMethod.GET)
	public String loginFailed(){
		logger.info("login has failed");
		return "loginFailed";
		
	}
	
	@RequestMapping(value = "/app/login", method = RequestMethod.GET)
	public String login(){
		logger.info("Welcome to login! The client locale is {}.");
		logger.info("login page");
		return "login";
		
	}
}
