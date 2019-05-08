package classwork1;

public class ex5 {
    public static void main(String[] args){
//      long card = 4033190012565448L;
//      long card = 4355053922842671L;
//      long card = 4033190001693268L;
        long card = 4355053922883303L;
        int sum = 0;
        int i = 1;

        while (card>0){
            int num = (int)(card%10);
            if (i%2 == 0){
                num*=2;
                if (num>9) {
                    sum += num % 10;
                    num /= 10;
                }
            }
            i++;
            sum += num;
            card /= 10;
        }
        System.out.println("Your Card " + (sum%10==0 ? "Vallid" : "Invallid") + ", \\ Sum Card Number = " + sum);

    }
}
