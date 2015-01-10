package com.mysystems.tree.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mysystems.tree.domain.User;
import com.mysystems.tree.service.UserService;

@Configurable
@Service( value = "userService" )
public class UserServiceImpl implements UserService,UserDetailsService{
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Override
	public Boolean login(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		logger.info("############ Within Userdetails");
		User user = null;
		GrantedAuthority planter = new SimpleGrantedAuthority("ROLE_PLANTER");
		GrantedAuthority adopter = new SimpleGrantedAuthority("ROLE_ADOPTER");
		
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		
				
		if(username.equals("treePlanter")){
			authorities.clear();
			authorities.add(planter);
			
		user = new User("treePlanter","treePlanter", true, true, true, true,authorities);	
		}
		
		if(username.equals("treeAdopter")){
			authorities.clear();
			authorities.add(adopter);
			
			user = new User("treeAdopter","treeAdopter", true, true, true, true,authorities);	
			}
		return user;
	}

}
