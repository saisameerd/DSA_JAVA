package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairPath {
    public static void main(String[] args) throws Exception {
        Scanner br = new Scanner (System.in);
        int n = br.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
        br.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n <= 0){
            ArrayList<String> bres = new ArrayList<>();

            if(n == 0){
                bres.add("");
            }

            return bres;
        }
    
        ArrayList<String> rres1 = getStairPaths(n - 1);
        ArrayList<String> rres2 = getStairPaths(n - 2);
        ArrayList<String> rres3 = getStairPaths(n - 3);
        ArrayList<String> mres = new ArrayList<>();

        for(String rstr: rres1){
            mres.add(1 + rstr);
        }

        for(String rstr: rres2){
            mres.add(2 + rstr);
        }

        for(String rstr: rres3){
            mres.add(3 + rstr);
        }

        return mres;
    }
}
