package Concrete;

import Abstract.ICampingService;
import Entities.Campaign;

public class CampingManager implements ICampingService {

	@Override
	public void Add(Campaign campaign) {
		
		System.out.println("�ndirim eklendi : " + campaign.getName());
		
	}

	@Override
	public void Update(Campaign campaign) {
		
		System.out.println("�ndirim g�ncellendi : " + campaign.getName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		
		System.out.println("�ndirim silindi : " + campaign.getName());
		
	}

}
