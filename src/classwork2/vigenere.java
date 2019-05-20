package classwork2;

import java.util.Scanner;

public class vigenere {
    public static void main(String[] args){
        Scanner mychar = new Scanner(System.in);

        char[] sentence = mychar.nextLine().toCharArray();
        char[] keyword = mychar.nextLine().toLowerCase().toCharArray();
        String newword = "";
        int key = 0, keylength = keyword.length;

        for (char letter:sentence) {
            if(letter >= 'A' && letter <= 'Z'){
                letter = (char)(letter + keyword[key++]-'a');
                if (letter > 'Z')
                    letter = (char)(letter - 26);
            }else if (letter >= 'a' && letter <= 'z'){
                letter = (char)(letter + keyword[key++]-'a');
                if (letter > 'z')
                    letter = (char)(letter - 26);
            }
            newword += letter;
            if (key == keylength)
                key = 0;
        }
        System.out.println(newword);
    }
}

