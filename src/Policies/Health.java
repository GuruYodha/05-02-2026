package Policies;

import java.util.Scanner;

public class Health implements Policies {

	
public void calculatePremium(String PolicyHolderName,double sum,int years) {
		
		double prem=500;
		
		if(years<=45) {
			prem=prem+(sum/80-years);
		}
		else {
			prem=prem+(sum/(80-years))-((prem/100)*20);
		}
		
		System.out.println(prem);
	}



}
