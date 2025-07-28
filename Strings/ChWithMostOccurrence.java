package Strings;

import java.util.Scanner;

public class ChWithMostOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int[] freq = new int[26];
        // 0-a,1-b,2-c,...25-z
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            int idx =(int)ch -97;
            freq[idx]++;


        }
        int maxfreq=-1;
        for (int i = 0; i < freq.length; i++) {
            maxfreq=Math.max(maxfreq,freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==maxfreq){
                char ch=(char)(i+97);
                System.out.print(ch+" ");
            }
        }
    }
}
