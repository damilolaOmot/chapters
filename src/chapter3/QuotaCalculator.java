package chapter3;

import java.util.Scanner;

/*
*IF ELSE
* All salespeople are expected to make at least 10 sales each week.
* For those who do, they receive a congratulatory message.
* For those who do not, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String[] args) {
        //Initialise values we know
        int quota = 10;

        //Get unknown values we know
        System.out.println("Enter the number of sales made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //Make a decision on the path to take Output
        if (sales >= quota){
            System.out.println("Congrats you have made your quota");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota. You were " + salesShort);
        }



    }
}
