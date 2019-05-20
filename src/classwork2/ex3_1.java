package classwork2;

import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args){
        Scanner mychar = new Scanner(System.in);

        char[] sentence = mychar.nextLine().toCharArray();
        char[] keyword = mychar.nextLine().toLowerCase().toCharArray();
        String newword = "";
        int key = 0, keylength = keyword.length;

        for (char letter:sentence) {
            if(letter >= 'A' && letter <= 'Z'){
                letter = (char)((letter - 'A' + keyword[key++]-'a')%26);
                letter += 'A';
            }else if (letter >= 'a' && letter <= 'z'){
                letter = (char)((letter - 'a' + keyword[key++]-'a')%26);
                letter += 'a';
            }
            newword += letter;
            if (key == keylength)
                key = 0;
        }
        System.out.println(newword);
    }
}


