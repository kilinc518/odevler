import java.rmi.RemoteException;

import Abstract.ICampingService;
import Abstract.ICustomerService;
import Abstract.IGameService;
import Abstract.ISalesService;
import Adapter.MersisServiceAdapter;
import Concrete.CampingManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Yunus");
		customer1.setLastName("Özkýlýnç");
		customer1.setDateOfBirthYear(1992);
		customer1.setNationalityId("15874361845");

		Customer customer2 = new Customer();
		customer2.setId(1);
		customer2.setFirstName("Ahmet");
		customer2.setLastName("Demir");
		customer2.setDateOfBirthYear(1991);
		customer2.setNationalityId("20896211145");

		ICustomerService customerService = new CustomerManager(new MersisServiceAdapter());
		customerService.Add(customer1);
		customerService.Add(customer2);

		System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Volfied");
		game1.setPrice(85);

		Game game2 = new Game();
		game2.setId(1);
		game2.setName("Doom 2");
		game2.setPrice(75);

		IGameService gameService = new GameManager();
		gameService.Add(game1);
		gameService.Add(game2);

		System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("10 TL indirim");
		campaign1.setDiscountAmount(10);
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(1);
		campaign2.setName("Yüzde 10 indirim");
		campaign2.setDiscountAmount(10);
		
		ICampingService campingService = new CampingManager();
		campingService.Add(campaign1);
		campingService.Add(campaign2);
		
		System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
		
		ISalesService salesService = new SalesManager();
		salesService.PercentCamping(customer1, game1, campaign2);
		salesService.NetCamping(customer1, game2, campaign1);

	}

}
