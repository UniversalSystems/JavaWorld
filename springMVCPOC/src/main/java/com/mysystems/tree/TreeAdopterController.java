package com.mysystems.tree;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysystems.tree.service.impl.TreeAdopterServiceImpl;

@Controller
public class TreeAdopterController {
private static final Logger logger = LoggerFactory.getLogger(TreeAdopterController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/app/adopt", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Adopt a tree ");
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println((SecurityContextHolder.getContext().getAuthentication().getAuthorities()));
		if(name.equals("treeAdopter")){
			new TreeAdopterServiceImpl().adoptATree("Banyan");
		}
		return "adopt";
	}
}
