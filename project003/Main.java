import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean running = true;

        while (running) {
            //banking ui
            System.out.println("\n=============");
            System.out.println("BloomBerg Accounts");
            System.out.println("=============");

            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. List All Accounts");
            System.out.println("5. Exit");

            System.out.print("Choose input: ");
            String userInput = sn.nextLine();

            if (userInput.equals("1")) {
                System.out.println("Thanks for choosing us. Enter your details below...");
                System.out.print("Enter your name: ");
                String name = sn.nextLine();

                System.out.print("Enter your preferred currency(NGN,GBP,USD): ");
                String currency = sn.nextLine();

                System.out.print("Enter your 4 digit bvn: ");
                String bvn = sn.nextLine();

                if (bvn.length() != 4) {
                    System.out.println("Invalid BVN. Must be exactly 4 digits.");
                    continue;
                }

                BankAccount userAccount = new BankAccount(name, currency, bvn);

                System.out.println("\nAccount created successfully!");
                System.out.println("Your account number is: " + userAccount.getAccountNumber());
            } else if (userInput.equals("4")) {
                if (BankAccount.getAllAccounts().isEmpty()) {
                    System.out.println("No accounts found.");
                } else {
                    System.out.println("\n--- All Accounts ---");
                    for (BankAccount acc : BankAccount.getAllAccounts()) {
                        System.out.println("Name: " + acc.userName + " | Currency: " + acc.currency + " | Account No: " + acc.getAccountNumber());
                    }
                }
            } else if (userInput.equals("5")) {
                System.out.println("Goodbye!");
                running = false;
            }
        }
    }
}