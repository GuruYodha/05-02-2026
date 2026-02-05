package OnlineFood;

public class Restaurant implements HalalDelivery {
	
	String Cname;
	int amt;
	double gst=0.08;
	double Finalamt;
	public double calculateFinalAmount() {
		
		return Finalamt=this.amt+(this.amt*this.gst);
		
	}
	public String getOrderDetails(String Cname,int amt) {
		
		this.Cname=Cname;
		this.amt=amt;
		return "Order placed"+this.Cname;
		
	}

}
