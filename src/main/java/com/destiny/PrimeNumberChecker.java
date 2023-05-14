package com.destiny;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
    	// Taking user Input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please give a number (enter 0 to exit) -> ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
   
            System.out.print("");
            System.out.println("User input is " + number);

        }
    }
}