package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SaleService {
	
	void saleWithoutCampaign(Game game, Customer customer);

	void saleWithCapaign(Campaign campaign, Customer customer, Game game);
	

}
