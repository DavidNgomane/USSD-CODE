public interface ITransaction {
    public Account login();
    public void sendMoney(Account me);
    public double withdrawMoney(Account me);
    public double depositMoney(Account me);
    public Account exit();
    public double checkBalance(Account acc);
}
