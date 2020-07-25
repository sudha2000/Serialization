package com.epam.Serialization;

import java.io.PrintStream;

public class House_construction_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House_Construction hs_obj=new House_Construction();
		PrintStream ps=new PrintStream(System.out);
		ps.println(hs_obj.caluculate_rent("standard materials",1000));
		ps.println(hs_obj.caluculate_rent("above standard materials",2000));
		ps.println(hs_obj.caluculate_rent("High standard materials",1050));
		ps.println(hs_obj.caluculate_rent("high standard materials and fully automated",1400));
		
		
	}

}
