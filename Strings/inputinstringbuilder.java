package Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class inputinstringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1,'c');
        System.out.println(sb);
    }

}
