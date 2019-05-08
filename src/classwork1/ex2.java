package classwork1;

public class ex2 {
    public static void main(String[] args) {

        int n = 20;
        int n2 = n/2;

        for (int i = 0; i < n2; i++){
            for (int j = 0; j < n2-i-1;  j++)
                System.out.print(" ");
            for (int j = n2-i-1; j < n2;  j++)
                System.out.print("#");
            System.out.print(" ");
            for (int j = n2; j < n2+i+1;  j++)
                System.out.print("#");
            System.out.println(" ");

        }
    }
}
