/* 7 kyu - Factorial
https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc
 */
public class Factorial {

    public int factorial(int n) {

        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("You're out of the range!");
        } else if (n == 0) {
            return 0;
        } else
            return factorial(n - 1) * n;

    }
}