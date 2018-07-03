package messenger.ChatServiceImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.ManageChatGroups;
import messenger.DbService.ChatService;
import messenger.Domain.Chat;
import messenger.Domain.User;

@Service
@Scope("singleton")
public class ManageChatGroupsImpl implements ManageChatGroups, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private ChatService chatDbService;

	@Override
	@Transactional
	public boolean addConversation(User user) {
		Chat chat = new Chat();
		List<User> users = new ArrayList<User>();
		
		users.add(user);
		chat.setUsers(users);
		chat.setGroupChat(false);
		
		try {
			chatDbService.persistObject(chat);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

	@Override
	@Transactional
	public boolean addGroupConversation(User user, String name) {
		Chat chat = new Chat();
		List<User> users = new ArrayList<User>();
		
		users.add(user);
		chat.setUsers(users);
		chat.setGroupChat(true);
		chat.setName(name);
		chat.setAdmin(user);
		
		try {
			chatDbService.persistObject(chat);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

	@Override
	@Transactional
	public boolean deleteConveration(Chat chat) {
		try {
			chatDbService.removeObject(chat);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

	@Override
	@Transactional
	public boolean updateConversation(Chat chat) {
		try {
			chatDbService.mergeObject(chat); //funktioniert das so? Ist das Objekt, was über die Rest Schnittstelle kommt, das gleiche Objekt?
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	@Transactional
	public List<Chat> getAllConversations(User user) {
		try{
			return user.getChats(); //Sinnvoll? Object wird bereits übergeben.
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public boolean addUserToConversation(Chat chat, User user) {
		List<User> users = chat.getUsers();
		users.add(user);
		
		chat.setUsers(users);
		
		try{
			chatDbService.persistObject(chat);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteUserFromConversation(Chat chat, User user) {
		List<User> users = chat.getUsers();
		users.remove(user);
		
		chat.setUsers(users);
		
		try{
			chatDbService.persistObject(chat);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

	@Override
	@Transactional
	public boolean grantAdminPermission(Chat chat, User user) {
		chat.setAdmin(user);
		
		try{
			chatDbService.persistObject(chat);
			return true;
		} catch (Exception e) {
			return false;
		}			
	}

	@Override
	@Transactional
	public boolean revokeAdminPermission(Chat chat, User user) {
		chat.setAdmin(null);
		
		try{
			chatDbService.persistObject(chat);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

	
}
