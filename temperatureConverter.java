//Importing 

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        System.out.println("Enter the temperature: ");
        Scanner input = new Scanner(System.in);
        double temp = input.nextDouble();
        
        System.out.println("Enter the unit: C or F?");
        Scanner input2 = new Scanner(System.in);
        char unit = input2.next().charAt(0);
        
        // Performing the Calculation according to inputs
        
        if (unit=='C') {
            double tempResult = (1.8 * temp) + 32;
            System.out.print("Your converted temperature is: ");
            System.out.println(tempResult);
            
        } else if (unit=='F') {
            double tempResult = (5/9)*(temp - 32);
            System.out.print("Your converted temperature is: ");
            System.out.println(tempResult);
            
        } else {
            System.out.println("Invalid Unit");
        }
    }
}
