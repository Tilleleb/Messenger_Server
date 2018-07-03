package messenger.DbServiceImpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.DbService.ChatService;
import messenger.Domain.Chat;

@Service
@Scope("singleton")
public class ChatServiceImpl implements ChatService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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

	@Override
	public Chat getChatById(Long chatId) {
		TypedQuery<Chat> query = em.createQuery("SELECT chat FROM Chat chat WHERE chatid = :chatid", Chat.class);
		query.setParameter("chatid", chatId);
		return query.getSingleResult();
	}

}