package business.concrete;

import business.abstracts.LoginService;
import business.abstracts.UserService;
import entities.concrete.User;

public class LocalLoginManager implements LoginService {

	UserService userService;
	
	public LocalLoginManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public boolean logIn(String email, String password) {
		
		User user = userService.getByEmail(email);
		if(user!=null)
		{
			if(user.getEmail()==email && user.getPassword() == password) {
				System.out.println("Yerel Kullanýcý Giriþi Baþarýlý...");
				return true;
			}
			return false;
		}
		
		return false;
	}

}
