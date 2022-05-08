/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public main {
    public static void main (String[] args) {
        ;
    }
}

class BankAccount {
    int balance;
    String customerName;
    int customerID;
    int previousTransaction;
    
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
    
    void getPreviousTransaction {
        if (previousTransaction > 0) {
            System.out.println("Amount Deposited: "+previousTransaction);
            
        } else if (previousTransaction < 0) {
            System.out.println("Amount Withdrawn: "+Math.abs(previousTransaction))
        } else {
            System.out.println("No transaction made!")
        }
    }
}
