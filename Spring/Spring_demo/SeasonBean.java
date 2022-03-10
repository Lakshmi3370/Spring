package com.xworkz.spring_demo;

public class SeasonBean {
	
	private String seasonName;
	
	
	public void provideClimate() {
		System.out.println("Get the season name");
	}
	
	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	
	public String getSeasonName() {
		return seasonName;
	}

}
