package messenger.ChatServiceImpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.ChatValidation;
import messenger.DbService.ChatService;

@Service
@Scope("singleton")
public class ChatValidationImpl implements ChatValidation, Serializable {
	
	@Autowired
	private ChatService conversationDbService;

	@Override
	public boolean checkIfChatExists(Long chatId) {
		// TODO Auto-generated method stub
		return false;
	}

}
