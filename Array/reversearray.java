package Array;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,60,70};
        for(int ele : arr){
            System.out.println(ele +" ");
        }
        int  n=arr.length;
        System.out.println();
        //reverse
//        for (int i = 0; i < n/2; i++) {
//            int j =n-1-i;
//            int temp =arr[i];
//            arr[i] =arr[j];
//            arr[j]= temp;
//
//        }

        int i=0 ,j=n-1;
        while(i<=j){
//            int temp = arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
            swap(arr,i,j);
            i++;
            j--;

        }
        for(int ele : arr){
            System.out.println(ele +" ");
        }



    }

    public static void swap(int[] arr,int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j] =temp;

    }

}
