package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        //Initialise the known
        int rate = 15;
        int maxHrs = 40;

        //Collect for unknown
        System.out.println("How many hours did you work for this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while(hoursWorked > maxHrs || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be 1 and 40. Try again");
            hoursWorked = scanner.nextDouble();

        }
        scanner.close();
        //calculate the gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
