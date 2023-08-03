package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class FerrisWheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();

        sc.nextLine();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int i=0;
        int j=n-1;
        int count = 0;

        while(i < j){
            if(arr[i] + arr[j] <= x){
                i++;
            }
            count++;
            j--;
        }
        if(i == j) count++;
        System.out.print(count);
        sc.close();
    }
}
