package assignment1;

import java.util.Scanner;

public class FifthProblem {
    public static void main(String[] arg){
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Time taken " + duration + " milliseconds");
        int f = fibonacciNumber(n);
        System.out.println(f);
    }
    /*
     *This method returns factorial of the number that we inputed.
     *Time complexity: 0(2^n), where n is number that we input.
     *Complexity class:  Exponential
     *@param n The is number that we input.
     *@return factorial by using recursion
     */
    public static int fibonacciNumber(int n){
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
        }
    }
}
