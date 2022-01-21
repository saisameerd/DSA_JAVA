package Recursion;

import java.util.Scanner;


public class last_occur {
    public static void main(String[] args) throws Exception {
        Scanner br = new Scanner(System.in);
        int n =  br.nextInt();
        int[] arr = new int[n];
  
        for (int i = 0; i < n; i++) {
           arr[i] = br.nextInt() ;
        }
        int x =br.nextInt();
        int fi = lastIndex(arr, 0, x);
      System.out.println(fi);
   }

   public static int lastIndex(int[] arr, int idx, int x) {
      if(idx == arr.length){
         return -1;
      }

      int liisa = lastIndex(arr, idx + 1, x);
      if(liisa != -1){
         return liisa;
      } else if(arr[idx] == x){
         return idx;
      } else {
         return -1;
      }
   }
       
}
