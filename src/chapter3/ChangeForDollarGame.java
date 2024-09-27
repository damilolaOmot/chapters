package chapter3;
/*
* The objective of the game is to enter enough change to equal exactly $1. Create
* a program that asks a user to enter the quantities for the following coins: pennies, nickels,
* dimes and quarters. Your program should count up the value of all the change. If its
* exactly $1, they win if  more than $1 tell them by how much they went over. if  less than
* $1 tell them by how much they went under. feel free to change the game for your country's currency
*
 */

import java.util.Scanner;

public class ChangeForDollarGame {
    public static void main(String[] args) {
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;


        //Information required
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int  numOfPennies = scanner.nextInt();

        System.out.println("How many nickel would you like?");
        int numOfNickels = scanner.nextInt();

        System.out.println("How many dime would you like");
        int numOfDimes = scanner.nextInt();

        System.out.println("How many quarter would you like");
        int numOfQuarters = scanner.nextInt();
        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = total -dollar;
            System.out.println("Sorry! You lose, you were short by " + amountShort );
        }
        else if(total > dollar){
            double amountOver = dollar -total;
            System.out.println("You lose! You were over by  " + amountOver );
        }
        else{
            System.out.println("You win! You have exactly $1");

        }

        }
    }

