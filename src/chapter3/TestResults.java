package chapter3;
/*
* IF-ELSE-IF
* Display a letter grade for a student based on their
* test score
 */

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        //Get the test score
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the letter grade
        char grade;
        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else if (score <= 100){
            grade = 'A';
        }
        else {
            grade = 'A';

        }

        System.out.println("Your grade is " + grade);
    }

}
