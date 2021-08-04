package dev.ajith.hibernate.hibernate_work_outs.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import dev.ajith.hibernate.hibernate_work_outs.entity.User;

@Repository
@Transactional
public class UserDaoService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	
	//for keep tarck of entity in persistance context
	public Long insert(User user) {
		entityManager.persist(user);
		user.setName("Jack");
		return user.getId();
	}

}
