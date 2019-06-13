package classwork2;

import java.util.Scanner;

public class caesar_2 {
    public static void main(String[] args) {
        Scanner myint = new Scanner(System.in);
        Scanner mychar = new Scanner(System.in);

        int key = myint.nextInt() % 26;
        char[] word = mychar.nextLine().toCharArray();
        String newword = "";

        for (char letter:word) {
            if(Character.isLetter(letter)){
                int ascii_offset = Character.isUpperCase(letter) ? 65 : 97;
                letter = (char) (letter - ascii_offset);
                letter = (char) ((letter + key) % 26 + ascii_offset);
            }
            newword += letter;
        }
        System.out.println(newword);
    }
}
