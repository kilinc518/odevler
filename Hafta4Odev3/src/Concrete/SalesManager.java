package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements ISalesService{

	@Override
	public void PercentCamping(Customer customer, Game game, Campaign campaign) {
		
		double finalPrice = (game.getPrice()-(game.getPrice()/100*campaign.getDiscountAmount()));
		System.out.println("Satýþ bilgileri");
		System.out.println("Müþteri adý : " + customer.getFirstName());
		System.out.println("Oyun adý : " + game.getName() + "----- Fiyatý :" + game.getPrice());
		System.out.println("Kampanya adý : " + campaign.getName()  + "----- Ýndirim :" + campaign.getDiscountAmount());
		System.out.println("Ýndirimden sonraki fiyatý : " + finalPrice);
		
	}

	@Override
	public void NetCamping(Customer customer, Game game, Campaign campaign) {
		
		double finalPrice = (game.getPrice()- campaign.getDiscountAmount());
		System.out.println("Satýþ bilgileri");
		System.out.println("Müþteri adý : " + customer.getFirstName());
		System.out.println("Oyun adý : " + game.getName() + "----- Fiyatý :" + game.getPrice());
		System.out.println("Kampanya adý : " + campaign.getName()  + "----- Ýndirim :" + campaign.getDiscountAmount());
		System.out.println("Ýndirimden sonraki fiyatý : " + finalPrice);
		
	}

}
