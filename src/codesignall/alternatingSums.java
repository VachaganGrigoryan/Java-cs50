package codesignall;

import java.util.Arrays;
import java.util.Scanner;

public class alternatingSums {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = myObj.nextInt();
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<length; i++ ) {
            myArray[i] = myObj.nextInt();
        }
        System.out.println(Arrays.toString(alternatingSums(myArray)));
    }
    static int[] alternatingSums(int[] a) {
        int[] sum = new int[2];
        for(int i = 0; i < a.length; i++)
            sum[i&1] += a[i];
        return sum;
    }
}
