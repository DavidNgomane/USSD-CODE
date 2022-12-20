public interface IUSSD {
    abstract User login(String username, String password);
    abstract double balance(String account);
    abstract double sendMoney(String account);
    abstract double withdrawMoney(String account);
    abstract double depositMoney(String account);
    abstract void exit();
}
