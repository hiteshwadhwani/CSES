package codeforces;

import java.util.Scanner;
import java.util.TreeMap;

public class RestaurantCustomers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            map.put(sc.nextInt(), 1);
            map.put(sc.nextInt(), -1);
        }

        int max = 0;
        int count = 0;
        for(int i:map.values()){
            count += i;
            max = Math.max(max, count);
        }

        System.out.print(max);
        

        // <---------------------- TLE SOLUTION ---------------------->
        // int[][] arr = new int[2*n][2];

        // for(int i=0;i<2*n;i=i+2){
        //     arr[i][0] = sc.nextInt();
        //     arr[i][1] = 1;

        //     arr[i+1][0] = sc.nextInt();
        //     arr[i+1][1] = -1;
        // }

        // Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        
        // int max = 0;
        // int count = 0;
        // for(int i=0;i<2*n;i++){
        //     count += arr[i][1];
        //     max = Math.max(max, count);
        // }

        // System.out.print(max);

        // <---------------------- TLE SOLUTION ---------------------->
        // for (int i = 0; i < n; i++) {
        //     arr[i][0] = sc.nextInt();
        //     arr[i][1] = sc.nextInt();
        //     sc.nextLine();
        // }

        // Arrays.sort(arr, (a, b) -> a[1] - b[1]);

        // int j = 0;
        // int max = 1;
        // int count = 0;

        // for (int i = 0; i < n; i++) {

        //     while (arr[i][0] >= arr[j][1]) {
        //         j++;
        //     }

        //     max = Math.max(max, i - j + 1);
        // }
        // System.out.println(max);

        sc.close();
    }
}
