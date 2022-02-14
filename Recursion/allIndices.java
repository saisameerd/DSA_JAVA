package Recursion;

import java.util.*;


public class allIndices {
    

  private static int[] arr;

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n =

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int x = scn.nextInt();
    int[] iarr = allIndice(arr, x, 0, 0);

    if (iarr.length == 0) {
      System.out.println();
      return;
    }

    for (int i = 0; i < iarr.length; i++) {
      System.out.println(iarr[i]);
    }
  }

  public static int[] allIndice(int[] arr, int x, int idx, int fsf) {
    if (idx == arr.length) {
      return new int[fsf];
    }

    int[] iarr;

    if (arr[idx] == x) {
      iarr = allIndice(arr, x, idx + 1, fsf + 1);
      iarr[fsf] = idx;
    } else {
      iarr = allIndice(arr, x, idx + 1, fsf);
    }

    return iarr;
  }

}
}
