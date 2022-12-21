public class Account extends User{
    private String account;
    private double amount;

    Account(String account, Double amount, 
    String username, String password) {
        super(username, password);
        this.account = account;
        this.amount = amount;

    }

    public String getAccount(){
		return account;
	}

    public double getAmount() {
        return amount;
    }

    public void setAccount(double acc){
        amount = acc;
    }
}
