package messenger.ChatServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

import messenger.ChatService.UserManagement;
import messenger.DbService.UserService;
import messenger.Domain.User;


@Service
@Scope("singleton")
public class UserManagementImpl implements UserManagement, Serializable {
	 
    @Autowired
    private UserService userDbService;

	@Override
	public int addUser(String username, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int loginUser(String username, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
  

}
