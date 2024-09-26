package chapter3;

import java.util.Scanner;

/*
If statements
All sales people get payment of 10000 a week.
Sales people who exceed 10 sales get a bonus of 250
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        //Initialize known values

        int salary = 10000;
        int bonus = 250;


        //Get values for unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //For bonus earners
        if(sales > 10){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employees pay is $" + salary);
    }
}
