package OnlineFood;
import java.util.*;
public class Cloud implements HalalDelivery{
	String Customername;
	int amt;
	int dist;
	double Finalamt;
	
	public double calculateFinalAmount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distance");
		dist=sc.nextInt();
		
		if(dist<=5) {
			return Finalamt=amt+30;
		}
		else {
			return Finalamt=amt+60;
		}
	}
	
	public String getOrderDetails(String Cname,int amt) {
		
		this.Customername=Cname;
		this.amt=amt;
		return "Kindly fill the following details: ";
		

	}
}
