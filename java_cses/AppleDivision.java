package codeforces;

import java.util.Scanner;

public class AppleDivision {
    static long min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        solve(arr, 0, 0, 0);
        System.out.println(min);
        sc.close();
    }
    public static void solve(int[] arr, int n, long sum1, long sum2){
        if(n == arr.length){
            min = Math.min(min, Math.abs(sum1 - sum2));
            return;
        }
        solve(arr, n+1, sum1 + arr[n], sum2);
        solve(arr, n+1, sum1, sum2 + arr[n]);
    }
}
