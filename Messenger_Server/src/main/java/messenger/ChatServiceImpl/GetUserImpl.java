package messenger.ChatServiceImpl;

import java.io.Serializable;

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

	@Autowired
    private UserService userDbService;

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
