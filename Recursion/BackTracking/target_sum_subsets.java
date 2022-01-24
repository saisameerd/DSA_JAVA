package Recursion.BackTracking;

import java.util.Scanner;

public class target_sum_subsets {
    public static void main(String[] args) throws Exception {
        Scanner  br = new Scanner (System.in);
        int n = br.nextInt();
        int[] arr = new int[n];
    
        for(int i = 0; i < n; i++){
           arr[i] = br.nextInt();
        }

        int tar = br.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(sos > tar){
            return;
        }

        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set + ".");
            }
            return;
        }

        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);
    }

}
