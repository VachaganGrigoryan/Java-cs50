package codesignall;

import java.util.Arrays;
import java.util.Scanner;

public class ipv4 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String arr = myObj.nextLine();
        System.out.println(isIPv4Address(arr));
    }
    static boolean isIPv4Address(String IPv4) {
        String[] ipArr = IPv4.split("\\.");
        boolean fl = false;
        if (ipArr.length == 4)
            for (String n : ipArr)
                if (n.matches("-?\\d+(\\.\\d+)?") && 0 <= Long.parseLong(n) && Long.parseLong(n) < 256)
                    fl = true;
                else{ fl = false; break;}
        return fl;
    }
}
