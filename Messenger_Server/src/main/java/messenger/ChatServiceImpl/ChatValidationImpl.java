package messenger.ChatServiceImpl;

import java.io.Serializable;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.ChatValidation;
import messenger.DbService.ChatService;

@Service
@Scope("singleton")
public class ChatValidationImpl implements ChatValidation, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ChatService chatDbService;

	@Override
	@Transactional
	public boolean checkIfChatExists(Long chatId) {
		try{
			chatDbService.getChatById(chatId);
			return true;
		} catch (NoResultException nre) {
			return false;
		}
	}

}
