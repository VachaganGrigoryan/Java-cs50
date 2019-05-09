package classwork2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner myint = new Scanner(System.in);
        Scanner mychar = new Scanner(System.in);

        int key = myint.nextInt();
        char[] word = mychar.nextLine().toCharArray();
        String newword = "";
        key = key%26;

        for (char i:word) {
            char c = (char)(i + key);
            if(c > 'Z'  && i >= 'A' && i <= 'Z'){
                c = (char)(c - 'Z' + 'A' - 1);
            }else if (c > 'z'){
                c = (char)(c - 'z' + 'a' - 1);
            }
            newword += c;
        }

        System.out.println(newword);
    }
}
