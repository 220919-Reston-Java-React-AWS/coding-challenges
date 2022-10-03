package com.revature;

public class Problem {

    public static boolean isPrime(int number) {
        // A number is prime if it's greater than 1 and the number is divisible by only itself and 1
        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2)); // true

        System.out.println(isPrime(-100)); // false

        System.out.println(isPrime(20)); // false

        System.out.println(isPrime(13)); // true
        System.out.println(isPrime(23)); // true
    }

}
