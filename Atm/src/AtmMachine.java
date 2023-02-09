import java.util.Scanner;

public class AtmMachine {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int balance = 0, withdraw, deposit;

        while (true) {
            System.out.println("ATM Machine\n");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT\n"); // using \n shortcut to print a sentence to the next line
            System.out.println("Choose the Operation");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdraw");

                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter money to be deposited");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Thank you! for using ATM Machine!");
                    System.exit(0);
            }
        }
    }
}
