package com.mysystems.tree;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysystems.tree.service.TreePlanterService;
import com.mysystems.tree.service.impl.TreePlanterServiceImpl;

@Controller
public class TreePlanterController {
private static final Logger logger = LoggerFactory.getLogger(TreePlanterController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@Autowired
	TreePlanterService treePlanterService;
	
	@RequestMapping(value = "/app/plant", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Plant a tree ");
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println((SecurityContextHolder.getContext().getAuthentication().getAuthorities()));
		if(name.equals("treePlanter")){
			treePlanterService.plantATree("Mango");
		}
		return "plant";
	}

}
