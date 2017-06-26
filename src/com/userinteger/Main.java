package com.userinteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //this is the scanner
        Scanner sc = new Scanner(System.in);
        //variable to store the input integer
        int number;
        int numDigits;
        int cubeTotal = 0;
        //greetings to user
        System.out.println("Ahoy hoy friend! I need a whole number from you (also known as an integer). \n" +
                "We're going to cube each digit of your number \n" +
                "and if the sum of the digits cubed is equal to your original number, " +
                "it will return true!!!!");
        //verify number is not negative
        do {
            //prompt user to enter a number
            System.out.println("Please enter a positive integer!");
            //verify that input is a number
            while (!sc.hasNextInt()) {
                System.out.println("That's not an integer! Please enter a positive integer :) ");
                sc.next(); // this is important!
            }
            //as long as input is number, store input integer in number variable
            number = sc.nextInt();
            //if number is positive, print to user that their input has been received and repeat their inputted value
        } while (number <= 0);
        //converts number into string
        String numString = "" + number;
        //variable that uses length method for strings to determine the length of the array
        int numLength = numString.length();
        //initialize array to hold characters of the integer, based on numLength
        char[] numArray;
        numArray = new char[numLength];
        //create integer for total
        int digitsCubedTotal = 0;
        //for loop populates array with the characters of the integer
        for (int i = 0; i <= (numLength - 1); i++) {
            numArray[i] = numString.charAt(i);
            //saves character in an integer variable named digit
            int digit = Character.getNumericValue(numArray[i]);
            //cubes digit
            int digitCubed = digit * digit * digit;
            // adds cubed digit to digitsCubedTotal
            digitsCubedTotal += digitCubed;
        }
        // calls on task logic that is contained within digitcompare method, and prints out the results
        System.out.println(digitcompare(number, digitsCubedTotal));
    }
    public static String digitcompare(int number, int digitsCubedTotal) {
        //conditional logic and results for user
        if (digitsCubedTotal == number) {
           return "true";
        } else {
            return "false";
        }
    }
}