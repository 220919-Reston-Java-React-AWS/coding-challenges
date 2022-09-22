package com.revature;

public class Main {

    public static void main(String[] args) {
        String output1 = Solution.weirdOrNotWeird(101); // Weird
        String output2 = Solution.weirdOrNotWeird(2); // Not Weird
        String output3 = Solution.weirdOrNotWeird(14); // Weird
        String output4 = Solution.weirdOrNotWeird(32); // Not Weird

        try {
            String output5 = Solution.weirdOrNotWeird(-11); // IllegalArgumentException

            System.out.println("FAIL");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS");
        }

        try {
            String output6 = Solution.weirdOrNotWeird(0); // IllegalArgumentException

            System.out.println("FAIL");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS");
        }

        String output7 = Solution.weirdOrNotWeird(1); // Weird

        if (output1.equals("Weird")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        if (output2.equals("Not Weird")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        if (output3.equals("Weird")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        if (output4.equals("Not Weird")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        if (output7.equals("Weird")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

}