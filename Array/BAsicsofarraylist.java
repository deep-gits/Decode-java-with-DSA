package Array;

import java.util.ArrayList;

public class BAsicsofarraylist {
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,38);
        arr.add(3,45);
        arr.add(4,56);
        arr.add(5,43);
 //       System.out.println(arr);
        for (int i = 0; i <=5 ; i++) {
            System.out.print((arr.get(i))+" ");

       }
        arr.set(2,300);
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print((arr.get(i))+" ");

        }
        arr.add(90);
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print((arr.get(i))+" ");

        }



    }
}
