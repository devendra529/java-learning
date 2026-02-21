import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // BankAccount obj= new BankAccount("Dev", 10000, 524178);
        //this is not dynamic
      /*   System.out.println("Account Holder: " + obj.getAccountHoldername());
         System.out.println("Balance: " + obj.getBalance());
        System.out.println("Account Number: " + obj.getAccountNumber());
        obj.Deposite(2000);
        System.out.println("After deposite amount balance is " + obj.getBalance());
        obj.Withdraw(1000);
        System.out.println("After Withdraw "+ obj.getBalance());
*/
 
// making this dynamic 
             System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount obj = new BankAccount(name,balance,number);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    obj.Deposite(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = sc.nextDouble();
                    obj.Withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + obj.getBalance());
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Bank Account system!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        

    }
}
