package business.abstracts;


import java.util.List;

import entities.concrete.User;

public interface UserService {
	boolean signIn(User user);
	List<User> getAll();
	User getById(int id);
	void register(int id);
	User getByEmail(String email);	
}
