/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Importing
import java.util.Scanner;

public main {
    public static void main (String[] args) {
        BankAccount bank1 = new BankAccount (123,"John");
        bank1.showMenu()
    }
}

class BankAccount {
    int balance;
    String customerName;
    int customerID;
    int previousTransaction;
    
    //Constructor
    
    public BankAccount (int cID, String cName) {
        customerName = cName;
        customerID = cID;
    }
    
    void deposit (int amount) {
        if (amount!=0) {
            balance += amount;
            previousTransaction = amount;
        }
    }
    
    void withdraw (int amount) {
        if (balance>amount && amount!=0) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }
    
    void getPreviousTransaction () {
        if (previousTransaction > 0) {
            System.out.println("Amount Deposited: "+previousTransaction);
            
        } else if (previousTransaction < 0) {
            System.out.println("Amount Withdrawn: "+Math.abs(previousTransaction))
        } else {
            System.out.println("No transaction made");
        }
    }
    
    void showMenu () {
        
        char option = '\0';
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is "+customerID);
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit an amount");
        System.out.println("C. Withdraw an amount");
        System.out.println("D. Check your previous transaction");
        System.out.println("E. Exit");
        
        do 
        {
            System.out.println("\n");
            System.out.println("-------------------------");
            System.out.println("Enter an option: ");
            System.out.println("-------------------------");
            System.out.println("\n");
            
            option = scan.next().charAt(0);
            switch (option) {
                
                case "A":
                    
                    System.out.println("-------------------------");
                    System.out.println("Your balance is "+balance);
                    System.out.println("-------------------------");
                    System.out.println("\n");
                    break;
                
                case "B":
                    System.out.println("-------------------------");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("-------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                
                case "C":
                    System.out.println("-------------------------");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("-------------------------");
                    int amount = scanner.nextInt();
                    withdraw(amount);
                    System.out.println("\n");
                    break;
                
                case "D": 
                    getPreviousTransaction();
                    break;
                
                default: 
                    System.out.println("Enter a valid option please");
                    break;
                    
            } while (option != 'E');
        }
        System.out.println("Thank you!");
    }
}
