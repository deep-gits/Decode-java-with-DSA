package Array;

import java.util.Scanner;

public class doubletinarrayssumisgivenx {
    public static void main(String[] args) {
        int[] arr={3,0,2,5,9,1,4};
        int x= 9;
        //solution
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);

            }

            
        }
        

        }

    }
}
