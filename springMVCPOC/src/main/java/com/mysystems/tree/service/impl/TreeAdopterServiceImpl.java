package com.mysystems.tree.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Service;

import com.mysystems.tree.service.TreeAdopterService;


@Service
public class TreeAdopterServiceImpl implements TreeAdopterService {

	@Override
	
	public Boolean adoptATree(String name) {
		System.out.println("Adopt "+name);
		return true;
	}
	
	
	public Collection<String> listTree(String adopterName){
	return new ArrayList<String>();	
	}

}
