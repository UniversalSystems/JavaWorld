/**
 * 
 */
package com.mysystems.tree.dao;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;


public class UserDao extends BaseDao {
	@Autowired
	DataSource datasource;

}
