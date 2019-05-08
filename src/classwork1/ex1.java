package classwork1;

public class ex1 {
    public static void main(String[] args) {

        int sum = 143;
        int[] coin = {50, 25, 10, 5, 1};

        for(int i:coin){
            int item = sum/i;
            if(item > 0) {
                System.out.println(item + " * " + i);
                sum = sum - item * i;
            }
        }
    }
}
