package messenger.ServerAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import messenger.ChatService.ChatValidation;
import messenger.Domain.Chat;

@RestController
public class ChatValidationAdapter {
	
	@Autowired
	private ChatValidation chatValidationService;

	@RequestMapping("/test")
	public Chat checkIfChatExists(@RequestParam(value="chatid", defaultValue="World") String chatid) {
		Chat testchat = new Chat();
		testchat.setName(chatid);
		//return chatValidationService.checkIfChatExists(chatId);
		return testchat;
	}

}
