package utils.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dataAccess.abstracts.UserDao;
import entities.concrete.User;
import utils.abstracts.UserValidatorService;

public class UserValidatorManager implements UserValidatorService {

	UserDao userDao;
    public UserValidatorManager(UserDao userDao) {
        this.userDao = userDao;
    }
	
	@Override
	public boolean SignInValidator(User user) {
		 boolean result = true;
	        String regex = "^(.+)@(.+)$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(user.getEmail());


	        if (user.getFirstName() == null) {
	            System.out.println("Ad alan� bo� b�rak�lamaz");
	            return false;
	        }

	        if (user.getFirstName().length() <= 1) {
	            System.out.println("Ad alan� en az 2 karakter olmal�d�r");
	            return false;
	        }

	        if (user.getLastName() == null) {
	            System.out.println("Soyad alan� bo� b�rak�lamaz");
	            return false;
	        }

	        if (user.getEmail() == null) {
	            System.out.println("Email alan� bo� b�rak�lamaz");
	            return false;
	        }

	        if (userDao.getAll().stream().anyMatch(u -> u.getEmail().equals(user.getEmail()))) {
	            System.out.println("Bu mail daha �nce kaydedilmi�");
	            return false;
	        }

	        if (!matcher.matches()) {
	            System.out.println("Ge�erli bir email adresi giriniz");
	            return false;
	        }

	        if (user.getPassword() == null) {
	            System.out.println("�ifre alan� bo� b�rak�lamaz");
	            return false;
	        }

	        if (user.getPassword().length() <= 5) {
	            System.out.println("�ifre alan� en az 6 karakter olmal�d�r");
	            return false;
	        }


	        return result;
	}

	@Override
	public boolean logInValidator(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
