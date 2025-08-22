package Strings;

import java.util.Scanner;

public class reverseeachwordinagivensentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  the sentence");
        StringBuilder s =new StringBuilder(sc.nextLine());
        int i =0;
        int j = 0;
        int n = s.length();
        while(j<n){
            if(s.charAt(j)!=' ') j++;
            else {
                reverse(s,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(s,i,j-1);
        System.out.println(s);


    }
    public static void reverse(StringBuilder s,int i,int j){
        while(i<=j){
            char temp = s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
