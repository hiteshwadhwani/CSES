package codeforces;

import java.util.Scanner;

public class ForestQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[][] matrix = new int[n][n];
        int[] queries = new int[q];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            String str = sc.nextLine();
            for (int j = 0; j < n; j++) {
                char ch = str.charAt(j);
                if (ch == '*')
                    sum++;
                matrix[i][j] = sum;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
