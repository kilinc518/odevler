package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void Add(Game game) {
		
		System.out.println("Oyun eklendi : " + game.getName());
		
	}

	@Override
	public void Update(Game game) {
		
		System.out.println("Oyun güncellendi : " + game.getName());
		
	}

	@Override
	public void Delete(Game game) {
		
		System.out.println("Oyun silindi : " + game.getName());
		
	}

}
