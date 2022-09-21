public class Main {

    public static void main(String[] args) {
        // invoke the method (run the method)
        String result = evenOrOdd(123);
        String result2 = evenOrOdd(50);

        System.out.println(result); // Odd
        System.out.println(result2); // Even

        System.out.println(evenOrOdd(1000)); // Even
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) { // number is even
            return "Even";
        } else {
            return "Odd";
        }
    }


}