package Policies;

import java.util.Scanner;

public class Vechicle implements Policies{
	static Scanner sc= new Scanner(System.in);	
	@Override
	public void calculatePremium(String PolicyHolderName,double VecVal,int wheelertype) {
		
		double prem=0;
		if(wheelertype==2) {
			prem=(VecVal/100)*2;
		}
		else {
			prem=(VecVal/100)*4;
		}
		System.out.println(prem);
	}

}
