package codesignall;

import java.util.Scanner;

public class reverseInParentheses {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        String txt = myObj.nextLine();
        System.out.println(reverseInParentheses(txt));
    }
    static String reverseInParentheses(String txtS) {
        int begin= 0;
        for(int i = 0; i < txtS.length(); i++){
            if(txtS.charAt(i)=='(')
                begin = i;
            if(txtS.charAt(i)==')'){
                int end = i;
                String revTxt = new StringBuffer(txtS.substring(begin+1,end)).reverse().toString();
                return reverseInParentheses(txtS.substring(0,begin)+revTxt+txtS.substring(end+1));
            }
        }
        return txtS;
    }

}
