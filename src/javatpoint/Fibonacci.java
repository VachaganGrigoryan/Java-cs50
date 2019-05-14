package javatpoint;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long N = myObj.nextInt();
        long fib = 0, fibnext = 1;

//        for (int i = 0; i < N; i++)
        while (fib < N){
            System.out.print(fib + " ");
            fibnext = swap(fib + fibnext, fib = fibnext);
        }
    }

    static long swap(long x, long y) {
        return x;
    }
}
