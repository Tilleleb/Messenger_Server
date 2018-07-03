package messenger.ChatServiceImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.ManageChatGroups;
import messenger.DbService.ChatService;
import messenger.DbService.UserService;
import messenger.Domain.Chat;
import messenger.Domain.User;

@Service
@Scope("singleton")
public class ManageChatGroupsImpl implements ManageChatGroups, Serializable {

	@Autowired
	private ChatService conversationDbService;

	@Autowired
	private UserService userDbService;

	@Override
	public boolean addConversation(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addGroupConversation(User user, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteConveration(Chat chat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateConversation(Chat chat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Chat> getAllConversations(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUserToConversation(Chat chat, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserFromConversation(Chat chat, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean grantAdminPermission(Chat chat, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean revokeAdminPermission(Chat chat, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
