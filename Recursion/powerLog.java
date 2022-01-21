package Recursion;
import java.io.*;
import java.util.*;

public class powerLog {
  
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int p = power(x, n);
    System.out.println(p);
    scn.close();
  }

  public static int power(int x, int n) {
    if(n == 0){
      return 1;
    }
    int xpnb2 = power(x, n / 2);
    int xpn = xpnb2 * xpnb2;

    if(n % 2 == 1){
      xpn = xpn * x;
    }

    return xpn;
  }

}

