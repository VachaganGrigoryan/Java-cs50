package codesignall;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EdgeOfTheOcean {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        List<Integer> intList = new ArrayList<Integer>();
        while (myObj.hasNextInt()) {
            intList.add(myObj.nextInt());
        }
        Integer[] intArray = new Integer[intList.size()];

        intArray = intList.toArray(intArray);

        System.out.println(isOneNum(intList));
        System.out.println(isOneNum_2(intArray));
        System.out.println(intList);
    }
    static boolean isOneNum_2(Integer[] s) {
        int l = s.length;
        int index = -1;
        int count=0;

        for (int i = 1; i < l; i++)
            if (s[i-1]>=s[i]){
                index=i;
                count++;
            }

        if (count > 1)
            return false;
        if (count == 0)
            return true;
        if (index == l-1 || index == 1)
            return true;
        if (s[index-1] < s[index+1])
            return true;
        if (s[index-2] < s[index])
            return true;
        return false;
    }
    static boolean isOneNum(List<Integer> sequence){
        boolean isOne = false;
        int last = Collections.min(sequence) - 1, prev = last;
        for (int elm:sequence){
            if (elm <= last) {
                if (isOne)
                    return false;
                else
                    isOne = true;
                if (elm <= prev)
                    prev = last;
                else if (elm >= prev)
                    prev = last = elm;
            }else {
                prev = last;
                last = elm;
            }
        }
        return true;
    }
}
