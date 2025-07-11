package twodarray;

import java.util.Scanner;

public class largestof2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j]= sc.nextInt();
            }
        }
         int mx = Integer.MIN_VALUE;
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx=Math.max(mx,a[i][j]);
                
            }

        }
        System.out.println(mx);


    }
}
