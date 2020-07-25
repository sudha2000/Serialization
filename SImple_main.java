package com.epam.Serialization;

import java.io.IOException;
import java.io.PrintStream;

public class SImple_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple_Compound si_obj=new Simple_Compound();
		
		PrintStream ps = new PrintStream(System.out);
		ps.println(si_obj.simple_inr(100, 4, 2));
		ps.println(si_obj.compound_inr(10, 4, 3));
		
		
	}

}
