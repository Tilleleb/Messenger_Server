package messenger.DbServiceImpl;

import java.util.List;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.DbService.UserService;
import messenger.Domain.User;

@Service
@Scope("singleton")
public class UserServiceImpl implements UserService, Serializable {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public <T> void persistObject(T entity) {
		em.persist(entity);
	}

	public <T> void removeObject(T entity) {
		entity = em.merge(entity);
		em.remove(entity);
	}

	public <T> void mergeObject(T entity) {
		em.merge(entity);
	}

	public List<User> getAllUsers() {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user", User.class);
		return query.getResultList();
	}

	@Override
	public User getUserByName(String username) {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user WHERE username = :username", User.class);
		query.setParameter("username", username);
		return query.getSingleResult();
	}
	
}