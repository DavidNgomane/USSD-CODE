import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public abstract class Transactions implements ITransaction {
    private List<Account> accounts;
    private Scanner input;

    Transactions() {
        accounts = new ArrayList<>();
        input = new Scanner(System.in);
    }

    public void readFromDB() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:/Users/user/Documents/test1/Database/datafile.txt"));
            String data;

            while ((data = br.readLine()) != null) {
                String[] fields = data.split(",");
                accounts.add(new Account(fields[2].trim(),
                        Double.valueOf(fields[3].trim()), fields[0].trim(), fields[1].trim()));
            }

            br.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void updateDB() {
        try {
            String record = "";
            FileWriter fr = new FileWriter("C:/Users/user/Documents/test1/Database/datafile.txt");

            for (Account acc : accounts) {
                record += acc.getName() + ", " + acc.getPassword() +
                        ", " + acc.getAccount() + ", " + acc.getAmount() + "\n";
            }

            fr.write(record);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Account login() {
        System.out.print("Enter username: ");
        String un = input.next();
        System.out.print("Enter password: ");
        String pwd = input.next();

        for (Account acc : accounts) {
            if (acc.getName().compareTo(un) == 0 && acc.getPassword().compareTo(pwd) == 0) {
                return acc;
            }
        }
        return null;
    }

    public List<Account> getAccounts(Double Amount) {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public void sendMoney(Account me) {
        System.out.println("Who are you sending money to: ");
        String acc = input.next();

        System.out.println("How much: ");
        double amnt = input.nextDouble();

        for (Account a : accounts) {
            if (a.getAccount().compareTo(acc) == 0) {
                me.setAccount(me.getAmount() - amnt);
                a.setAccount(a.getAmount() + amnt);
                break;
            }
        }
        updateDB();
    }

    @Override
    public double withdrawMoney(Account me) {
        System.out.print("Withdrwal Amount: ");
        double amnt = input.nextDouble();

        // Withdraw...

        me.setAccount(me.getAmount() - amnt);

        // When you are done withdrawing...
        updateDB();
        return 0;
    }

    @Override
    public double depositMoney(Account me) {
        System.out.print("Deposit Amount: ");
        double amnt = input.nextDouble();

        // Deposit...

        me.setAccount(me.getAmount() + amnt);

        updateDB();

        return 0;
    }

    @Override
    public Account exit() {
        System.out.println("Bye...");
        return null;
    }

    @Override
    public double checkBalance(Account acc) {
        return acc.getAmount();
    }
}
