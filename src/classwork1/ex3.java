package classwork1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter number");

        int num = myObj.nextInt();

        System.out.println((num+50)/100*100);

    }
}
