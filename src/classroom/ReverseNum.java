package classroom;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 132;
        System.out.println(reverseNum(num));
    }

    public static int reverseNum(int num) {
        if (num < 10){
            return num;
        }
        return Integer.parseInt(new StringBuilder().append(num % 10).append(reverseNum(num / 10)).toString());
    }
}
