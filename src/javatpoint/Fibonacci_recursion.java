package javatpoint;

import java.util.Scanner;

public class Fibonacci_recursion {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();

        System.out.println(fibRecursion(n));
    }

    static int fibRecursion(int N){
        return  (N < 2 ? N : fibRecursion(N-1) + fibRecursion(N-2));
    }
}
