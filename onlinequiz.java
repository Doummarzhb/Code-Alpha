public class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor and methods for deposit, withdrawal, and checking balance
}
import java.util.Scanner;

public class SimpleBankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " balance: $" + balance);
    }

    public static void main(String[] args) {
        // Initialize BankAccount objects
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        Scanner scanner = new Scanner(System.in);

        // Continuous operations loop
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account1.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account1.withdraw(withdrawAmount);
                    break;
                case 3:
                    account1.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
    }
}
public static void deposit(BankAccount account, double amount) {
    // Implement deposit logic
}
    public class BankAccount {
    // Other existing methods and properties...

    public static void deposit(BankAccount account, double amount) {
        account.balance += amount;
        System.out.println("Deposited $" + amount + " into account " + account.accountNumber);
    }

    // Other existing methods...

    public static void main(String[] args) {
        // Initialize BankAccount objects
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        // Deposit using the static method
        deposit(account1, 200.0);
        deposit(account2, 300.0);

        // Other operations...
    }
}


public static void withdraw(BankAccount account, double amount) {
}
    public class BankAccount {
    // Other existing methods and properties...

    public static void withdraw(BankAccount account, double amount) {
        if (amount <= account.balance) {
            account.balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + account.accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + account.accountNumber);
        }
    }

    // Other existing methods...

    public static void main(String[] args) {
        // Initialize BankAccount objects
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        // Withdraw using the static method
        withdraw(account1, 200.0);
        withdraw(account2, 700.0);

        // Other operations...
    }
}



public static void checkBalance(BankAccount account) {
    // Implement checking balance logic
}

public static void exitProgram() {
    // Implement exit logic
}
public class BankAccount {
    // Other existing methods and properties...

    public static void checkBalance(BankAccount account) {
        System.out.println("Account " + account.accountNumber + " balance: $" + account.balance);
    }

    // Other existing methods...

    public static void main(String[] args) {
        // Initialize BankAccount objects
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        // Check balance using the static method
        checkBalance(account1);
        checkBalance(account2);

        // Other operations...
    }
}

   while (!exit) {
            // Display menu and get user input
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            // Perform selected operation
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    BankAccount.deposit(account1, depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    BankAccount.withdraw(account1, withdrawAmount);
                    break;
                case 3:
                    BankAccount.checkBalance(account1);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    
