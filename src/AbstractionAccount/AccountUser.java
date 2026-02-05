package AbstractionAccount;

import java.util.Scanner;

public class AccountUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer ID:");
        int custId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Customer Name:");
        String custName = sc.nextLine();

        System.out.println("Enter Customer Email:");
        String custEmail = sc.nextLine();

        Customer customer = new Customer(custId, custName, custEmail);

        SavingAccount sbi = new SavingAccount();


        boolean n = true;

        while (n) {
            System.out.println("\nPress 1 to DepositMoney\n" +
                    "Press 2 to WithdrawMoney\n" +
                    "Press 3 to CheckMoney\n" +
                    "Press 4 to exit\n");

            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    long dep = sc.nextLong();
                    sbi.deposit(dep);
                    System.out.println("Deposit Successful!");
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    long wid = sc.nextLong();
                    sbi.withdraw(wid);
                    break;

                case 3:
                    System.out.println("Current Balance: " + sbi.checkBalance());
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    n = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            if (n) {
                System.out.println("Do u want to continue Y/N");
                sc.nextLine();
                String a = sc.nextLine();

                if (!a.equalsIgnoreCase("Y")) {
                    n = false;
                    System.out.println("Thank you for using our Bank");
                }
            }
        }

        sc.close();
    }
}
