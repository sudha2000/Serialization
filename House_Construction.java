package com.epam.Serialization;

public class House_Construction {
	String material_standard;
	int total_area;
	int caluculate_rent(String material_standard,int total_area) {
		int amount=0;
		if(material_standard.equals("standard materials")) {
			amount+=1200;
		}
		else if(material_standard.equals("above standard materials")) {
			amount+=1500;
		}
		else if(material_standard.equals("High standard materials")) {
			amount+=1800;
		}
		else if(material_standard.equals("high standard materials and fully automated")) {
			amount+=2500;
		}
		return amount*total_area;
		
	}

}
