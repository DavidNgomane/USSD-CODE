public interface ITransaction {
    public Account login();
    public void sendMoney(Account me);
    public double withdrawMoney();
    public double depositMoney();
    public Account exit();
    public double checkBalance(Account acc);
}
