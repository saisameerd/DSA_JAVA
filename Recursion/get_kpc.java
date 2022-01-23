package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class get_kpc {
    public static void main(String[] args) throws Exception {
        Scanner  br = new Scanner (System.in);
        String str = br.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        for(char chcode: codes[ch - '0'].toCharArray()){
            for(String rstr: rres){
                mres.add(chcode + rstr);
            }
        }

        return mres;
    }
}
