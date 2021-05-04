package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements ISalesService{

	@Override
	public void PercentCamping(Customer customer, Game game, Campaign campaign) {
		
		double finalPrice = (game.getPrice()-(game.getPrice()/100*campaign.getDiscountAmount()));
		System.out.println("Sat�� bilgileri");
		System.out.println("M��teri ad� : " + customer.getFirstName());
		System.out.println("Oyun ad� : " + game.getName() + "----- Fiyat� :" + game.getPrice());
		System.out.println("Kampanya ad� : " + campaign.getName()  + "----- �ndirim :" + campaign.getDiscountAmount());
		System.out.println("�ndirimden sonraki fiyat� : " + finalPrice);
		
	}

	@Override
	public void NetCamping(Customer customer, Game game, Campaign campaign) {
		
		double finalPrice = (game.getPrice()- campaign.getDiscountAmount());
		System.out.println("Sat�� bilgileri");
		System.out.println("M��teri ad� : " + customer.getFirstName());
		System.out.println("Oyun ad� : " + game.getName() + "----- Fiyat� :" + game.getPrice());
		System.out.println("Kampanya ad� : " + campaign.getName()  + "----- �ndirim :" + campaign.getDiscountAmount());
		System.out.println("�ndirimden sonraki fiyat� : " + finalPrice);
		
	}

}
