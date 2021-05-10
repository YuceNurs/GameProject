package Concrete;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService {

	@Override
	public void saleWithoutCampaign(Game game, Customer customer) {
		System.out.println("Oyun satýn alýndý. Tutar:"+" " + game.getPrice());
		
	}

	@Override
	public void saleWithCapaign(Campaign campaign, Customer customer, Game game) {
		System.out.println(campaign.getCampaignName()+"Kampanyalý oyun satýn alýndý.Tutar:"+" "+game.getPriceAfterCampaign());
		
	}



}
