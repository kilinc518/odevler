package dataAccess.abstracts;

import java.util.List;

import entities.concrete.User;

public interface UserDao {
	boolean add(User user);
    List<User> getAll();
    boolean update(User user);
    User getUserById(int id);
    User getUserByEmail(String email);
}
