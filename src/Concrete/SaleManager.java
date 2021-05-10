package Concrete;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService {

	@Override
	public void saleWithoutCampaign(Game game, Customer customer) {
		System.out.println("Oyun sat�n al�nd�. Tutar:"+" " + game.getPrice());
		
	}

	@Override
	public void saleWithCapaign(Campaign campaign, Customer customer, Game game) {
		System.out.println(campaign.getCampaignName()+"Kampanyal� oyun sat�n al�nd�.Tutar:"+" "+game.getPriceAfterCampaign());
		
	}



}
