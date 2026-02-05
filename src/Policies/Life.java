package Policies;
import java.util.*;
public class Life implements Policies{
	
public void calculatePremium(String PolicyHolderName,double sum,int years) {
		
		double prem = (sum / years) * 0.05;
		
		System.out.println("Monthly Premium is: "+prem);
	}


}
