package Strings;

import java.util.Scanner;

public class digitinnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eNTER A NUMBER");
        int n =sc.nextInt();
        //String s =""+n;
        //System.out.println(s.length());
        String s= Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());

    }
}
