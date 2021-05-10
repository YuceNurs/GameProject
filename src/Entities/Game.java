package Entities;

import Abstract.Entity;

public class Game implements Entity {
	
	private int id;
	private String gameName;
	private double price;
	private String detail;
	private int campaignDiscount;
	private double priceAfterCampaign;
	
	public Game(int id, String gameName, double price,String detail,double priceAfterCampaign) {
		
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.detail = detail;
		this.priceAfterCampaign=priceAfterCampaign;
	}

	public Game() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Game(int campaignDiscount) {
		super();
		this.campaignDiscount = campaignDiscount;
	}

	public int getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

	public double getPriceAfterCampaign() {
		return this.price-(this.price*this.campaignDiscount/100);
	}
	

}
