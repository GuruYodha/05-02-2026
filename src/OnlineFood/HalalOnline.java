package OnlineFood;

import java.util.Scanner;

import Policies.Health;
import Policies.Life;
import Policies.Policies;
import Policies.Vechicle;

public class HalalOnline {

	public static void main(String[] args) {
		System.out.println("=======WELCOME TO HALAL ONLINE DELIVERIES=========");
		Scanner sc=new Scanner(System.in);
		boolean n=true;
		while(n) {
		System.out.println("press 1 to order from Restaurant\n"+
				"press 2 to order from Groceries\n"+
				"press 3 to order Cloud Kitchen\n"+"press 4 to exit"
						);
		int input=sc.nextInt();
		switch(input) {
		
		case 1:
			
			System.out.println("enter the Customer name");
			String Cname=sc.nextLine();
			sc.nextLine();
			System.out.println("enter the Order Price");
			int Price=sc.nextInt();
			HalalDelivery R=new Restaurant();
			System.out.println( R.getOrderDetails(Cname, Price));
			System.out.println( "Final Bill: "+R.calculateFinalAmount());
			break;
			
		case 2:
			
		    System.out.println("enter the Customer name");
			String Cname1=sc.nextLine();
			sc.nextLine();
			System.out.println("enter the Order Price");
			int Price1=sc.nextInt();
			
			HalalDelivery G=new Grocery();
			System.out.println( G.getOrderDetails(Cname1, Price1));
			System.out.println("Final Bill: "+ G.calculateFinalAmount());
			break;
	
		case 3:
			 	System.out.println("enter the Customer name");
				String Cname2=sc.nextLine();
				sc.nextLine();
				System.out.println("enter the Order Price");
				int Price2=sc.nextInt();
				
				HalalDelivery C=new Cloud();
				System.out.println( C.getOrderDetails(Cname2, Price2));
				System.out.println("Final Bill: "+C.calculateFinalAmount());
				break;
		case 4:
			
			System.out.println("Thank u for using Halal Online Deliveries...Please visit again");
			System.exit(1);
		
		}
		System.out.println("Do u want to continue Y/N");
		sc.nextLine();
		String cont=sc.nextLine();
		if(!cont.equalsIgnoreCase("Y")) {
			n=false;
			System.out.println("Thank u for using Halal Online Deliveries...Please visit again");
		}
		}
	}
}
