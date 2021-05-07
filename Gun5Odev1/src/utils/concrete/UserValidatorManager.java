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
	            System.out.println("Ad alaný boþ býrakýlamaz");
	            return false;
	        }

	        if (user.getFirstName().length() <= 1) {
	            System.out.println("Ad alaný en az 2 karakter olmalýdýr");
	            return false;
	        }

	        if (user.getLastName() == null) {
	            System.out.println("Soyad alaný boþ býrakýlamaz");
	            return false;
	        }

	        if (user.getEmail() == null) {
	            System.out.println("Email alaný boþ býrakýlamaz");
	            return false;
	        }

	        if (userDao.getAll().stream().anyMatch(u -> u.getEmail().equals(user.getEmail()))) {
	            System.out.println("Bu mail daha önce kaydedilmiþ");
	            return false;
	        }

	        if (!matcher.matches()) {
	            System.out.println("Geçerli bir email adresi giriniz");
	            return false;
	        }

	        if (user.getPassword() == null) {
	            System.out.println("Þifre alaný boþ býrakýlamaz");
	            return false;
	        }

	        if (user.getPassword().length() <= 5) {
	            System.out.println("Þifre alaný en az 6 karakter olmalýdýr");
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
