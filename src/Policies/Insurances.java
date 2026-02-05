package Policies;
import java.util.*;
public class Insurances {

	public static void main(String[] args) {
		
		
		System.out.println("=======WELCOME TO GURU INSURANCE CALCULATOR=========");
		Scanner sc=new Scanner(System.in);
		boolean n=true;
		while(n) {
		System.out.println("press 1 to calculate Vehicle Premium\n"+
				"press 2 to calculate Life Premium\n"+
				"press 3 to calculate Health Premium\n"+"press 4 to exit"
						);
		int input=sc.nextInt();
		switch(input) {
		
		case 1:
			
			System.out.println("enter the policy holder name");
			String PolicyHoldername=sc.nextLine();
			sc.nextLine();
			System.out.println("enter the VecVal");
			double Vecval=sc.nextDouble();
			
			System.out.println("enter the WheelerType");
			int wheelertype=sc.nextInt();
			
			Policies vp = new Vechicle();
			vp.calculatePremium(PolicyHoldername,Vecval,wheelertype);
			break;
			
		case 2:
			
			System.out.println("enter the policy holder name");
			String PolicyHoldername1=sc.nextLine();
			sc.nextLine();
			System.out.println("enter the Sum Assured");
			double sum=sc.nextDouble();
			
			System.out.println("enter Your Policy Terms");
			int years=sc.nextInt();
			
			Policies lp=new Life();
			lp.calculatePremium(PolicyHoldername1,sum,years);
			
			break;
		
		case 3:
			
			System.out.println("enter the policy holder name");
			String PolicyHoldername2=sc.nextLine();
			sc.nextLine();
			System.out.println("enter the Sum Assured");
			double sum2=sc.nextDouble();
			
			System.out.println("enter Your Age");
			int years2=sc.nextInt();
			
			Policies hp=new Health();
			hp.calculatePremium(PolicyHoldername2,sum2,years2);
			
			break;
			
		case 4:
			
			System.out.println("Thank u for using Guru Insurance Calculator");
			System.exit(1);
		
		}
		System.out.println("Do u want to continue Y/N");
		sc.nextLine();
		String cont=sc.nextLine();
		if(!cont.equalsIgnoreCase("Y")) {
			n=false;
			System.out.println("Thank u for using Guru Insurance Calculator");
		}
		
	}
	}
}
