package com.destiny;

public class PrimeResult {
    private boolean isPrime;
    private int iterations;

    public PrimeResult(boolean isPrime, int iterations) {
        this.isPrime = isPrime;
        this.iterations = iterations;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public int getIterations() {
        return iterations;
    }
}


