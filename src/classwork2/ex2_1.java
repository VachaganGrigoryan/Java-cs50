package classwork2;

import java.util.Scanner;

public class ex2_1 {
        public static void main(String[] args){
            Scanner myObj = new Scanner(System.in);

            int key = myObj.nextInt()%26;
            char[] word = myObj.nextLine().toCharArray();
            String newword = "";

            for (char letter:word) {
                if (letter >= 'A' && letter <= 'Z') {
                    letter = (char) ((letter + key - 'A')%26);
                    letter+='A';
                }else if(letter >= 'a' && letter <= 'z'){
                    letter = (char) ((letter + key - 'a')%26);
                    letter+='a';
                }
                newword += letter;
            }

            System.out.println(newword);
        }
    }
