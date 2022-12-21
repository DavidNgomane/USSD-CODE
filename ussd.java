import java.util.Scanner;

public class USSD extends Transactions implements IUSSD {
    Account session;
    Scanner input;

    USSD() {
        super();
        input = new Scanner(System.in);
    }

    @Override
    public void startApplication() {
        readFromDB();

        if ((session = login()) != null) {
            while (session != null) {
                showMenu();
                int option = input.nextInt();

                switch (option) {
                    case 1:
                        sendMoney(session);
                        break;
                    case 2:
                        depositMoney();
                        break;
                    case 3:
                        withdrawMoney();
                        break;
                    case 99:
                        session = exit();
                }

            }
        } else {
            System.out.println("Invalid login details!!!");
        }
    }

    @Override
    public void showMenu() {
        System.out.println("Balance: R" + checkBalance(session));
        System.out.println("1. Send Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("99. Exit");
    }

}
