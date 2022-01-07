public class FizzBuzz {

    // An example solution to the FizzBuzz problem. My first implementation after hearing the problem.
    // For integers 1-100, if divisible by 3, print Fizz. If by 5, print Buzz. If both, FizzBuzz. If none, print the integer value.

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0) {
                output += "Fizz";
            } if (i % 5 == 0) {
                output += "Buzz";
            } if (output.isEmpty()) {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }
    }
}
