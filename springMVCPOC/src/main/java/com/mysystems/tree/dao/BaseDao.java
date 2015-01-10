/**
 * 
 */
package com.mysystems.tree.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * @author GY
 * 
 */
@Repository
public class BaseDao {
	@PersistenceContext
	private EntityManager entityManager ;

	public EntityManager getEntityManager() {
		
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	

}
