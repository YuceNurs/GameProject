import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer gamer1 = new Customer();
		gamer1.setId(1);
		gamer1.setNationalityId("12345678912");
		gamer1.setFirstName("Merve");
		gamer1.setLastName("Kaya");
		gamer1.setNickName("MrvKK");
		gamer1.setDateOfBirth(2000,1,2);
	    
		Customer gamer2 = new Customer();
		gamer2.setId(2);
		gamer2.setNationalityId("23123365512");
		gamer2.setFirstName("Ece");
		gamer2.setLastName("Yýlmaz");
		gamer2.setNickName("UUUuu");
		gamer2.setDateOfBirth(2000,3,16);
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(gamer2);
		 customerManager.update(gamer1);
		customerManager.delete(gamer2);
		
		System.out.println("----------------------------------");
		
		Game game1 =new Game();
		game1.setId(1);
		game1.setGameName("Asphalt 8");
		game1.setDetail("Asfalt aðlatýn!");
		game1.setPrice(19.99);
		game1.setCampaignDiscount(10);
		
		
		Game game2 =new Game();
		game2.setId(2);
		game2.setGameName("Asphalt 9");
		game1.setDetail("Asfalt aðlatýr.");
		game2.setPrice(29.99);
		game2.setCampaignDiscount(0);
		
		GameManager gameManager =new GameManager();
		gameManager.delete(game1);
		
		System.out.println("----------------------------------");
		
	    Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setCampaignName("Sepette %10 indirim.");
		
		SaleManager saleManager = new SaleManager();
		saleManager.saleWithoutCampaign(game2, gamer2);
		saleManager.saleWithCapaign(campaign2, gamer2, game1);
		
		System.out.println("---------------");
		
	}

}
