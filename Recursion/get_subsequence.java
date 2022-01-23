package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class get_subsequence {
    public static void main(String[] args) throws Exception {
       Scanner br = new Scanner (System.in);
        String str = br.next();
        ArrayList<String> ss = gss(str);
        System.out.println(ss);
        br.close();
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rem = gss(ros);
        ArrayList<String> finalAns = new ArrayList<>();

        for(String rstr: rem){
            finalAns.add(rstr);
        }

        for(String rstr: rem){
            finalAns.add(ch + rstr);
        }
        return finalAns;
    }
}
