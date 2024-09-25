package chapter2;

import java.util.Scanner;

//Create a program that asks a user for
// a season of the year, then a whole number, then an adjective.
// And use the input to complete the sentence below. Output the result.
public class madLibs {
    public static void main(String[] args) {
        //Get the season of the year
        System.out.println("Please enter the season of the year");
        Scanner scanner = new Scanner(System.in);
        String seasonOfYear = scanner.next();

        //Request for a whole number
        System.out.println("Please provide a whole number");
        int wholeNum = scanner.nextInt();

        //Request for an adjective
        System.out.println("Enter an adjective");
        String adj = scanner.next();

        scanner.close();

        //Complete a sentence
        System.out.println("On a " + adj + " " +  seasonOfYear + "day, I drank a minimum of " + wholeNum + "cups of coffee");

        //Display the result


    }
}
