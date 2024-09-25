package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //1.Get the number of hours worked
        System.out.println("Enter the  number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int noOfHours = scanner.nextInt();

        //2.Get the hourly pay rate
        System.out.println("Enter the employees pay rate");
        double hourlyPayRate = scanner.nextDouble();
        scanner.close();

        //3.Multiply hours and pay rate
        double grossPay = noOfHours * hourlyPayRate;

        //4.Display result
        System.out.println("The employee's gross pay is $ " + grossPay);

    }
}
