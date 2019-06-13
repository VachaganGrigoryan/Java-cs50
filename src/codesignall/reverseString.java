package codesignall;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println(buildPalindrome(myObj.nextLine()));
    }

    static String buildPalindrome(String st) {
        int n = st.length();
        for(int i = 0; i < n; i++){
            String newst = st.substring(i,n);
            if(newst.equals(new StringBuffer(newst).reverse().toString()))
                return st.substring(0,i) + newst + new StringBuffer(st.substring(0,i)).reverse().toString();
        }
        return st;
    }

    // String reverseString (String s) {
//     String reverse = "";
//     for(int i = s.length() - 1; i >= 0; i--)
//         reverse += s.charAt(i);
//     return reverse;

// }
// boolean checkPalindrome(String s){
//     for(int i = 0;i < s.length()/2;i++)
//         if(s.charAt(s.length() - 1 - i) != s.charAt(i))
//             return false;
//     return true;

// }
// String buildPalindrome(String st) {
//     String temp = reverseString(st);
//     if(checkPalindrome(st))
//         return st;
//     for(int i = 0;i < st.length();i++)
//         if(checkPalindrome(st + temp.substring(temp.length() - 1 - i)))
//             return st + temp.substring(temp.length() - 1 - i);
//     return st + temp.substring(1);

// }

}
