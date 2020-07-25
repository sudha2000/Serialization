package com.epam.Serialization;
import java.lang.*;
public class Simple_Compound {
	int amount,time,interest;
	int simple_inr(int amount,int time,int interest) {
		return (amount*time*interest)/100;
	}
	int compound_inr(int amount,int time,int interest) {
		return (amount*((int) Math.pow(1+(interest/100),time)));
	}

}
