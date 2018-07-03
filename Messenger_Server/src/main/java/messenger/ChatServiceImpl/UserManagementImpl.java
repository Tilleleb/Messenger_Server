package messenger.ChatServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

import javax.persistence.NoResultException;

import messenger.ChatService.UserManagement;
import messenger.DbService.UserService;
import messenger.Domain.User;


@Service
@Scope("singleton")
public class UserManagementImpl implements UserManagement, Serializable {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
    private UserService userDbService;

	@Override
	@Transactional
	public int addUser(String username, String password) {
		try{
			userDbService.getUserByName(username);
			return 1;
		} catch (NoResultException nre) {
		}	
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		try{
			userDbService.persistObject(user);
			return 0;
		} catch (Exception e) {
			return 2;
		}	
	}

	@Override
	@Transactional
	public boolean deleteUser(User user) { //TODO User aus Chat allen Chats entfernen durch Cascade? 
		try{
			userDbService.removeObject(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateUser(User user) {
		try{
			userDbService.mergeObject(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	@Transactional
	public User loginUser(String username, String password) {
		try{
			User user = userDbService.getUserByName(username);
			
			if(user.getPassword() != password) {
				return null;
			}
			
			return user;
		} catch (NoResultException nre) {
			return null;
		}
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDbService.getAllUsers();
	}
  

}
