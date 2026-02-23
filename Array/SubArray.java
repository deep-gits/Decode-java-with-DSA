package Array;

import java.util.Scanner;

public class SubArray {
    public static void SubArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        SubArray(arr);


    }
}
