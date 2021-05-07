import business.abstracts.LoginService;
import business.abstracts.UserService;
import business.concrete.GoogleLoginManager;
import business.concrete.LocalLoginManager;
import business.concrete.LocaleUserManager;
import entities.concrete.User;

public class Main {

	public static void main(String[] args) {
				
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Ahmet");
		user1.setLastName("Demir");
		user1.setEmail("ahmet@ahmet.com");
		user1.setPassword("sifre123");
		user1.setRegistered(false); 
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Mehmet");
		user2.setLastName("Erkan");
		user2.setEmail("ahmet@ahmet.com");
		user2.setPassword("sifre123");
		user2.setRegistered(false);
		
		User user3 = new User();
		user3.setId(3);
		user3.setFirstName("Mehmet");
		user3.setLastName("Erkan");
		user3.setEmail("mehmet@erkan.com");
		user3.setPassword("12345");
		user3.setRegistered(false);
		
		User user4 = new User();
		user4.setId(4);
		user4.setFirstName("Mehmet");
		user4.setLastName("Erkan");
		user4.setEmail("mehmeterkan.com");
		user4.setPassword("1234567");
		user4.setRegistered(false);
		
		User user5 = new User();
		user5.setId(4);
		user5.setLastName("Erkan");
		user5.setEmail("mehmeterkan.com");
		user5.setPassword("1234567");
		user5.setRegistered(false);
		
		
		UserService userService = new LocaleUserManager();
		
		
		System.out.println("Kurallara uygun kullanýcý");
		userService.signIn(user1);
		System.out.println("------------------------------");
		
		System.out.println("Ayný mail ikinci kez kullanýldý");
		userService.signIn(user1);
		System.out.println("------------------------------");
		
		System.out.println("Þifre kurallarý kontrol edildi");
		userService.signIn(user3);
		System.out.println("------------------------------");
		
		System.out.println("Eposta kurallarý kontrol edildi");
		userService.signIn(user4);
		System.out.println("------------------------------");
		
		System.out.println("Zorunlu alan kurallarý kontrol edildi");
		userService.signIn(user5);
		System.out.println("------------------------------");
		
		userService.register(1);
		
		LoginService loginService1 = new LocalLoginManager(userService);
		loginService1.logIn(user1.getEmail(), user1.getPassword());
		
		LoginService loginService2 = new GoogleLoginManager();
		loginService2.logIn(user1.getEmail(), user1.getPassword());

	}

}
