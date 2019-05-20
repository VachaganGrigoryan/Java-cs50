package classwork2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner myint = new Scanner(System.in);
        Scanner mychar = new Scanner(System.in);

        int key = myint.nextInt()%26;
        char[] word = mychar.nextLine().toCharArray();
        String newword = "";

        for (char letter:word) {
            if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + key);
                if (letter > 'Z') {
                    letter = (char) (letter - 26);
                }
            }else if(letter >= 'a' && letter <= 'z'){
                letter = (char) (letter + key);
                if (letter > 'z') {
                    letter = (char) (letter - 26);
                }
            }
            newword += letter;
        }
        
        System.out.println(newword);
    }
}
