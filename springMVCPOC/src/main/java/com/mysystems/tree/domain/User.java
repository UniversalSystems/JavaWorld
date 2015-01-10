package com.mysystems.tree.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;

public class User extends org.springframework.security.core.userdetails.User implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public User(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired,
				accountNonLocked, authorities);
		// TODO Auto-generated constructor stub
	}
	
}
