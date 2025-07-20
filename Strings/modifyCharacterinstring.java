package Strings;

public class modifyCharacterinstring {
    public static void main(String[] args) {
        String s = "hello";
        // 2nd index change to y
        s= s.substring(0,2) + "y" + s.substring(3);
        System.out.println(s);
    }
}
