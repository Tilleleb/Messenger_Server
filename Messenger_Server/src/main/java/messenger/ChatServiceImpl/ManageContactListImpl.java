package messenger.ChatServiceImpl;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

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

	@Autowired
	private UserService userDbService;

	@Override
	public boolean addContact(User user, User contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(User user, User contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getContactList(User user) {
		// TODO Auto-generated method stub
		return null;
	}


}
