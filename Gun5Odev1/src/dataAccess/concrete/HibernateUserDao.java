package dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class HibernateUserDao implements UserDao {
	private List<User> userDatabase;

	public HibernateUserDao() {
		if (userDatabase == null) {
			userDatabase = new ArrayList<>();
		}
	}

	@Override
	public boolean add(User user) {
		userDatabase.add(user);
		return true;
	}

	@Override
	public List<User> getAll() {
		return userDatabase;
	}

	@Override
	public boolean update(User user) {
		var userIndex = userDatabase.indexOf(user);
		userDatabase.set(userIndex, user);
		return true;
	}

	@Override
	public User getUserById(int id) {

		for (User user : userDatabase) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		for (User user : userDatabase) {
			if (user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}
}
