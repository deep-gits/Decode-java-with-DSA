package Strings;

public class append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abc");
        System.out.println(s);
        s.append(34);
        s.append('#');
        System.out.println(s);

    }
}
