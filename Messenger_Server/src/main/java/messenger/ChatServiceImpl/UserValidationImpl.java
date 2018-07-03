package messenger.ChatServiceImpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.UserValidation;
import messenger.DbService.UserService;

@Service
@Scope("singleton")
public class UserValidationImpl implements UserValidation, Serializable {
	
	@Autowired
    private UserService userDbService;

	@Override
	public boolean checkIfUserExists(Long userId) {
		// TODO Auto-generated method stub
		return false;
	} 

}
