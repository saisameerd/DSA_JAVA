package Recursion;

import java.util.Scanner;

public class tower_0f_hanoi {
    public static void main(String[] args) throws Exception {
     Scanner br = new Scanner(System.in);
        int n = br.nextInt();;
        int n1 = br.nextInt();
        int n2 = br.nextInt();
        int n3 = br.nextInt();
    
        toh(n, n1, n2, n3);
      }
    
      public static void toh(int n, int t1id, int t2id, int t3id){
        if(n == 0){
          return;
        }
        /*faith is the top disks will go to 3rd tower ,
         remaining 3rd disk will go to 2nd tower 
         and then the top tow disks from 3rd tower will go to 2nd tower */
        toh(n - 1, t1id, t3id, t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        toh(n - 1, t3id, t2id, t1id);
      }

       /*
            input-
            3
            10
            11
            12 
            output-
            1[10 -> 11]
            2[10 -> 12]
            1[11 -> 12]
            3[10 -> 11]
            1[12 -> 10]
            2[12 -> 11]
            1[10 -> 11]
*/
}
