package AbstractionAccount;

class Customer {
    int CustId;
    String CustName;
    String CustEmail;
    public Customer(int CustId, String CustName, String CustEmail) {
        this.CustEmail = CustEmail;
        this.CustName = CustName;
        this.CustId = CustId;
    }
}
