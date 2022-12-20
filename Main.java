public class Main {

    public static void menu() {
        // display options to choose from
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Send Money");
        System.out.println("4. Withdraw");
        System.out.println("99. Cancel/Exit");
        System.out.println();
    }

    public static void main(String[] args) {

        USSD s = new USSD();
        s.startApplication();

        // Account acc = new Account("12345678", 10000, "Mpumelelo", "1234");
        // System.out.println(acc.getName());

        // File file = new File(
        // );

        // Scanner sc = new Scanner(System.in);
        // String username;
        // String password;
        // boolean session = false;

        // // Display bank name
        // System.out.println("Geeks Bank");
        // System.out.println();

        // System.out.print("Enter your username: ");
        // username = sc.next();

        // System.out.print("Enter your pin: ");
        // password = sc.next();

        // session = true;

        // System.out.println(username + " " + password);

        // int option;
        // System.out.println("Choose Option: ");

        // while (session) {
        // menu();
        // option = sc.nextInt();

        // switch (option) {
        // case 1:
        // System.out.println("Check Balance");
        // break;
        // case 2:
        // System.out.println("Deposit");
        // break;
        // case 3:
        // System.out.println("Send Money");
        // break;
        // case 4:
        // System.out.println("Withdraw");
        // break;
        // case 99:
        // session = false;
        // break;
        // default:
        // System.out.println("Invalid Input");
        // break;
        // }
        // }
    }
}