package com.mysystems.tree.service.impl;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

@Configurable
@Service
public class ServiceAuthorizationAspect {
	
	
	public Object preFilter(JoinPoint name){
		String str = name.getSignature().getName();
		System.out.println("withing pre advice " + str);
		return  str;
		
	}
	
	public Object postFilter(JoinPoint name){
		System.out.println( "The parameter passes in post advice is "+ name);
		String strPost = new String("World");
		return strPost ;
	}

}
