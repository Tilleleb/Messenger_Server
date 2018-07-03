package messenger.ChatServiceImpl;

import java.io.Serializable;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.GetUser;
import messenger.DbService.UserService;
import messenger.Domain.User;

@Service
@Scope("singleton")
public class GetUserImpl implements GetUser, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
    private UserService userDbService;

	@Override
	@Transactional
	public User getUser(String username) {
		try{
			return userDbService.getUserByName(username);
		} catch (NoResultException nre) {
			return null;
		}
	}
	

}
