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
            PrimeResult result2 = checkPrimeMethod2(number);
            
            boolean isPrime = result.isPrime();
            int method1Iterations = result.getIterations();
            int method2Iterations = result2.getIterations();
            
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

            System.out.println("With 1st method number of iteration is: " 
            + method1Iterations);
            System.out.println("With 2nd method number of iteration is: " 
            + method2Iterations);
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

// checking for prime using primality algorithm
private static PrimeResult checkPrimeMethod2(int number) {
    int iterations = 0;
    int b = number;
    int x = number;
    int i = 2;

    while (x > 1 && i <= b) {
        while (x % i == 0) {
            iterations++;
            x = x / i;
            b = x;
        }
        i++;
    }

    return new PrimeResult(x == 1, iterations);
}
	        
}

