package codesignall;

import java.util.Scanner;

public class bitOperator {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int k = myObj.nextInt();

        System.out.println(bitOperator(n,k));

    }
    static int bitOperator(int n, int k){
        return n^n&1<<k-1;
    }
}
