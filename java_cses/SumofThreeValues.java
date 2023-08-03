package java_cses;

import java.util.Arrays;
import java.util.Scanner;

public class SumofThreeValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        sc.nextLine();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[] { sc.nextInt(), i+1};
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                if (l != i && r != i && arr[i][0] + arr[l][0] + arr[r][0] == target) {
                    System.out.println(arr[i][1] + " " + arr[l][1] + " " + arr[r][1]);
                    sc.close();
                    System.exit(0);
                }
                if (arr[i][0] + arr[l][0] + arr[r][0] < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        System.out.print("IMPOSSIBLE");
        sc.close();

    }
}
