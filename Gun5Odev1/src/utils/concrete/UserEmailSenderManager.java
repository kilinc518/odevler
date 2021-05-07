package utils.concrete;

import utils.abstracts.EmailSender;

public class UserEmailSenderManager implements EmailSender {
	@Override
	public void sendEmail(String emailAdress, String message) {
		System.out.println(emailAdress + " adresine " + message + " maili yollandı");
	}
}
