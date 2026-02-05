package OnlineFood;
import java.util.*;
public class Grocery implements HalalDelivery  {
		static Scanner sc=new Scanner(System.in);
		
		String Cname;
		int amt;
		String hasMembership;
		double Finalamt;
		
		public double calculateFinalAmount() {
			System.out.println("Do u have a Membership Y/N");
			hasMembership=sc.nextLine();
			
			if(hasMembership.equalsIgnoreCase("Y")) {
				return Finalamt=amt-(amt*0.01);
			}else
				return Finalamt=amt;
			
		}
		public String getOrderDetails(String Cname,int amt) {
			
			this.Cname=Cname;
			this.amt=amt;
			return "Kindly fill the following details: ";
			
		}

	}



