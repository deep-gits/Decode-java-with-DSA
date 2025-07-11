package twodarray;

import java.util.Scanner;

public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr =new int[3][3];
        int m =arr.length;//no of rows
        int n = arr[0].length;
        System.out.println(n+m);
//        arr[0][0] = 10;
//        arr[0][1] = 20;
//        arr[0][2] = 30;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();

            }

        }
//
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");

            }

        }







    }

}

