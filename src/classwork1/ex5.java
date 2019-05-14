package classwork1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        long card = myObj.nextLong();
        int sum = 0;
        boolean isTwo = false;

        while (card>0){
            int num = (int)(card%10);
            if (isTwo)
                num*=2;
            isTwo = !isTwo;

            sum += num/10 + num % 10;
            card /= 10;
        }
        System.out.println("Your Card " + (sum%10==0 ? "Vallid" : "Invallid") + ", \\ Sum Card Number = " + sum);
    }
}
