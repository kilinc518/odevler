package utils.abstracts;

import entities.concrete.User;

public interface UserValidatorService {
	boolean SignInValidator(User user);
    boolean logInValidator(User user);
}
