package business.concrete;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import dataAccess.concrete.HibernateUserDao;
import entities.concrete.User;
import utils.abstracts.EmailSender;
import utils.abstracts.UserValidatorService;
import utils.concrete.UserEmailSenderManager;
import utils.concrete.UserValidatorManager;

public class LocaleUserManager implements UserService {

	
	private UserDao userDao = new HibernateUserDao();
   	UserValidatorService userValidatorService = new UserValidatorManager(userDao);
    EmailSender emailSender = new UserEmailSenderManager();
   


    @Override
    public boolean signIn(User user) {

        if(!userValidatorService.SignInValidator(user))
        {
            System.out.println("�yelik ��leminiz Ba�ar�s�z");
            return false;
        }

        userDao.add(user);
        emailSender.sendEmail(user.getEmail(),"Aktivasyon kodu yollanm��t�r");
        System.out.println("�yelik ��lemi Ba�ar�l�");
        return true;
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void register(int id) {
        var user = userDao.getUserById(id);
        if(user!=null){
            user.setRegistered(true);
            if(userDao.update(user))
            {
                System.out.println("Aktivaston ba�ar�yla tamamland�");
            }else{
                System.out.println("Aktivastonda hata olu�tu");
            }
        }else{
            System.out.println("Aktivastonda hata olu�tu - Kullan�c� bulunamad�");
        }
    }

	@Override
	public User getById(int id) {
		var user = userDao.getUserById(id);
        if(user!=null){
        	return user;
        }else {
        	return null;
        }
	}

	@Override
	public User getByEmail(String email) {
		var user = userDao.getUserByEmail(email);
        if(user!=null){
        	return user;
        }else {
        	return null;
        }
	}

	
}
