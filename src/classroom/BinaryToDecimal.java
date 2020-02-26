package classroom;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int  binary_num = 10;
        System.out.println(convert(binary_num));
    }

    public static int convert(int binary_num){
        int decimal_num = 0, base = 1;

        while (binary_num > 0) {
            decimal_num += binary_num%10 * base;
            binary_num /= 10;
            base *= 2;
        }

        return decimal_num;
    }
}
