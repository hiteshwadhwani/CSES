package codeforces;


import java.util.Scanner;
import java.util.HashSet;


public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        System.out.print(set.size());
        sc.close();
    }
}
