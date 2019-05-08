package classwork2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        int sum = 0;

        while (number>0){
            sum += number%10;
            number /= 10;
            if (number==0 && sum>9){
                number = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
