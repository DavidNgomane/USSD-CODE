import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        //Display bank name
       System.out.println("Geeks Bank");
       System.out.println();

       //display options to choose from
       System.out.println("1. Check Balance");
       System.out.println("2. Deposit");
       System.out.println("3. Send Money");
       System.out.println("4. Withdraw");
       System.out.println("5. Cancel/Exit");
       System.out.println();

       //accept input from user
        System.out.println("Choose Option: ");
        int option = sc.nextInt();

       //variable to store option entered
       String choice = " ";

      //test user input
      switch(option) {
    
        case 1: 
            choice = "Check Balance";
            break;
        case 2:
            choice = "Deposit";
            break;
        case 3:
            choice = "Send Money";
            break;
        case 4: 
            choice = "Withdraw";
            break;
        case 5: 
            choice = "Cancel/Exit";
            break;
        case 6: 
            System.exit(0);
            break;
        default:
            choice = "Invalid Input";
            break;
      }

        // Display the option selected
        System.out.println(choice);
      

      
    }
}