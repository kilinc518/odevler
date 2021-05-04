package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface ISalesService {
	void PercentCamping(Customer customer, Game game, Campaign campaign);
	void NetCamping(Customer customer, Game game, Campaign campaign);
}
