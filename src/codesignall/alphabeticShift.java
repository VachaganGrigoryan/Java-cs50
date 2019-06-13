package codesignall;

import java.util.Scanner;

public class alphabeticShift {
    public static void  main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println(alphabeticShift(myObj.nextLine()));

    }

    static String alphabeticShift(String inputString) {
        char [] res = inputString.toCharArray();
        for(int i = 0; i<res.length;i++)
            res[i] = res[i] != 'z' ? (char)(res[i]+1) : 'a';

        return String.valueOf(res);
    }
}
