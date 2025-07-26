package Strings;

import java.util.Arrays;

public class sortingastring {
    public static void main(String[] args) {
        String s="raghav";
        char[] ch=s.toCharArray();
        for(char ele:ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);

        for(char ele:ch){
            System.out.print(ele);
        }
        System.out.println();

    }
}
