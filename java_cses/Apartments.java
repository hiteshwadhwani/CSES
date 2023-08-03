package codeforces;


import java.util.Arrays;
import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        long[] applicants = new long[n];
        long[] appartments = new long[m];
        
        sc.nextLine();

        for(int i=0;i<n;i++){
            applicants[i] = sc.nextInt();
        }
        sc.nextLine();

        for(int i=0;i<m;i++){
            appartments[i] = sc.nextInt();
        }

        Arrays.sort(applicants);
        Arrays.sort(appartments);

        int i = 0;
        int j = 0;
        int count = 0;

        while(i < n && j < m){
            if(Math.abs(appartments[j] - applicants[i]) <= k){
                count++;
                i++;
                j++;
            }
            else if(appartments[j] < applicants[i]){
                j++;
            }
            else{
                i++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
