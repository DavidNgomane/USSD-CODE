public interface ITransaction {
    public Account login();
    public double sendMoney();
    public double withdrawMoney();
    public double depositMoney();
    public Account exit();
    public double checkBalance(Account acc);
}
