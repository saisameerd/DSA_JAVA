package Recursion;

import java.util.Scanner;

public class mazepath_jumps {
    public static void main(String[] args) throws Exception {
        Scanner  br = new Scanner (System.in);
        int n = br.nextInt();
        int m = br.nextInt();
        printMazePaths(0, 0, n - 1, m - 1, "");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr > dr || sc > dc){
            return;
        }

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for(int move = 1; move <= dc - sc; move++){
            printMazePaths(sr, sc + move, dr, dc, psf + "h" + move);
        }
        
        for(int move = 1; move <= dr - sr; move++){
            printMazePaths(sr + move, sc, dr, dc, psf + "v" + move);
        }

        for(int move = 1; move <= dc - sc && move <= dr - sr; move++){
            printMazePaths(sr + move, sc + move, dr, dc, psf + "d" + move);
        }
    } 
}
