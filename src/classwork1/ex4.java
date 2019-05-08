package classwork1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        System.out.println("Enter Triangle a, b, c ");
        Scanner myObject = new Scanner(System.in);

        int a = myObject.nextInt();
        int b = myObject.nextInt();
        int c = myObject.nextInt();

        if(a>b && a>c)
            c = swap(a,a=c);
        else if (b>c)
            c = swap(b,b=c);

        if (a+b>c)
            if(a*a+b*b==c*c)
                System.out.println("Right Triangle");
            else if (a*a+b*b<c*c)
                System.out.println("Obtuse Triangle");
            else
                System.out.println("Acute Triangle");
        else
            System.out.println("No Triangle");

    }
    public static int swap(int x,int y){
        return x;
    }
}
