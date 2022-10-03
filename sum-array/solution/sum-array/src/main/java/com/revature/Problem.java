package com.revature;

public class Problem {

    public static int sum(int[] array) {
        int sum = 0;

        // iterate through array and add each element to sum
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] {1, 2, 3, 4, 5})); // 15
        System.out.println(sum(new int[] {10, 21, 30})); // 61
    }

}
