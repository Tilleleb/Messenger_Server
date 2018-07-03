package messenger.ChatServiceImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.Communication;
import messenger.DbService.ChatService;
import messenger.DbService.MessageService;
import messenger.DbService.UserService;
import messenger.Domain.Chat;
import messenger.Domain.Message;
import messenger.Domain.User;

@Service
@Scope("singleton")
public class CommunicationImpl implements Communication, Serializable {
	
	@Autowired
	private UserService userDbService;
	
	@Autowired
	private ChatService conversationDbService;
	
	@Autowired
	private MessageService messageDbService;

	@Override
	public boolean sendMessage(Message message) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Message> recieveMessage(Chat chat) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
