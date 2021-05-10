package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampaya eklendi:"+" "+campaign.getCampaignName());
		}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi:"+" " +campaign.getCampaignName());	
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya kaldýrýldý:"+" "+campaign.getCampaignName());
		
	}
}
