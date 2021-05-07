package business.concrete;

import GoogleService.GoogleUserManager;
import business.abstracts.LoginService;

public class GoogleLoginManager implements LoginService {

	@Override
	public boolean logIn(String email, String password) {
		boolean result;
		
		
		GoogleUserManager loginManager = new GoogleUserManager();
		if(loginManager.logIn(email, password)) {
			System.out.println("Google hizmeti üzerinden giriþ baþarýlý");
			result = true;
		}else {
			result = false;
		}
		
		return result;	
	}

}
