package Array;
import java.util.*;


public class arraysyntax {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0]=100;
        arr[1]=20;
        arr[2]=30;
        arr[3]=400;
        arr[4]=500;
        System.out.println(Arrays.toString(arr));
        arr[0]=99;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<=6;i++){
            System.out.println(arr[i]);
        }



    }
}
