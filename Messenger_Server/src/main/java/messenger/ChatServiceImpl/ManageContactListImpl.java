package messenger.ChatServiceImpl;

import java.util.List;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.ManageContactList;
import messenger.DbService.UserService;
import messenger.Domain.User;

@Service
@Scope("singleton")
public class ManageContactListImpl implements ManageContactList, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService userDbService;

	@Override
	@Transactional
	public boolean addContact(User user, User contact) {
		List<User> contacts = user.getContacts();
		contacts.add(user);
		
		user.setContacts(contacts);
		
		try{
			userDbService.persistObject(user);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

	@Override
	@Transactional
	public boolean deleteContact(User user, User contact) {
		List<User> contacts = user.getContacts();
		contacts.remove(user);
		
		user.setContacts(contacts);
		
		try{
			userDbService.persistObject(user);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

	@Override
	@Transactional
	public List<User> getContactList(User user) {
		try{
			return user.getContacts(); //sinnvoll? 
		} catch (Exception e) {
			return null;
		}	
	}


}
