package AbstractionAccount;

class SavingAccount extends Account {

public void deposit(long depmoney) {
        this.balancefield += depmoney;
    }

    public long withdraw(long widmoney) {
    	if(widmoney>balancefield||widmoney<=0) {
    		System.out.println("Not sufficient money");
    		return this.balancefield;
    	}
    	else {
        this.balancefield -= widmoney;
    	System.out.println("Withdraw Successful!");
        return this.balancefield ;
    }
    	
    	
    	
    }	
    public long checkBalance() {
    	return this.balancefield;
    }
   
}
