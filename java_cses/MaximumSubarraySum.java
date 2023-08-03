package codeforces;

import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        long min = 0;
        long sum = 0;
        long max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sum += arr[i];
            max = Math.max(max, sum - min);

            min = Math.min(min, sum);
        }
        System.out.print(max);
        sc.close();

    }
    
}
