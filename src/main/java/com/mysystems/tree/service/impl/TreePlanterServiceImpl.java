package com.mysystems.tree.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.mysystems.tree.service.TreePlanterService;

@Service(value="treePlanterService")
public class TreePlanterServiceImpl implements TreePlanterService {
	private static final Logger logger = LoggerFactory.getLogger(TreePlanterServiceImpl.class);
	@Override

		public Boolean plantATree(String name) {
		System.out.println("Plant "+name);
		String nameContext = SecurityContextHolder.getContext().getAuthentication().getName();
		logger.info("Principal name in TreePlanterService is " +nameContext);
        boolean status = true; 
		return status;
	}

}
