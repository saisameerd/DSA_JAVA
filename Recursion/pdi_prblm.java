
 import java.io.*;
 import java.util.*;
 
 
 public class pdi_prblm{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        pdi(num);
        scn.close();

    }

    // This function prints numbers in decreaseing and increasing format

    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
        
    }


}