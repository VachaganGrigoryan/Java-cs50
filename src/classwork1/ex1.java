package classwork1;

public class ex1 {
    public static void main(String[] args) {

        int sum = 143;

        int[] coin = {50, 25, 10, 5, 1};

        int i = 0;

        while (sum > 0){
            int item = sum/coin[i];
            if(item > 0) {
                System.out.println(item + " * " + coin[i]);
                sum = sum - item * coin[i];
            }
            i++;
        }

    }
}
