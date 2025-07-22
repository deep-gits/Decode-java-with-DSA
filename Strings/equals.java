package Strings;

public class equals {
    public static void main(String[] args) {
        String s =" abcxyz";
        String t ="abc";
        String b = new String(s);
        t = t+"xyz";
        System.out.println(s==t);
        System.out.println(s.equals(b));
    }
}
