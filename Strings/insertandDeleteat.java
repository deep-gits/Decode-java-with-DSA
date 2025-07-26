package Strings;

public class insertandDeleteat {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcdef");
        System.out.println(s);
        s.deleteCharAt(3);
        System.out.println(s);
        s.append("xyz");
        s.delete(2,6);
        System.out.println(s);
        s.insert(2,"sssee");


    }
}
