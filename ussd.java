import java.util.Scanner;

public class USSD extends Transactions implements IUSSD {
    Account myobject;
    Scanner input;

    USSD() {
        super();
        input = new Scanner(System.in);
    }

    @Override
    public void startApplication() {
        readFromDB();

        if ((myobject = login()) != null) {
            while (myobject != null) {
                showMenu();
                int option = input.nextInt();

                switch (option) {
                    case 1:
                        sendMoney(myobject);
                        break;
                    case 2:
                        depositMoney(myobject);
                        break;
                    case 3:
                        withdrawMoney(myobject);
                        break;
                    case 99:
                        myobject = exit();
                }

            }
        } else {
            System.out.println("Invalid login details!!!");
        }
    }

    @Override
    public void showMenu() {
        System.out.println("Balance: R" + checkBalance(myobject));
        System.out.println("1. Send Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("99. Exit");
    }

}
