package com.destiny;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter a number (enter 0 to exit): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

           // int method1Iterations = findFactorsMethod1(number);
            
            PrimeResult result = checkPrimeMethod1(number);
            boolean isPrime = result.isPrime();
            int method1Iterations = result.getIterations();
            
            if (isPrime){
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is a composite number and factors are:");
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }

            System.out.println("Number of iterations with Method I: " + method1Iterations);
        }

        scanner.close();
    }
    
private static PrimeResult checkPrimeMethod1(int number) {
	
	    int iterations = 0;
	    
	        for (int i = 2; i < number; i++) {
	        	 iterations++;
	            if (number % i == 0) {             	
	        	      return new PrimeResult(false, iterations);	                	            
	        	            }	                
	        }
	         return new PrimeResult(true, iterations);
	            
}	        	                
	        
}

