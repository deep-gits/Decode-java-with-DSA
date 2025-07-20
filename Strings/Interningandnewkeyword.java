package Strings;

public class Interningandnewkeyword {
    public static void main(String[] args) {
        String s ="Raghav";
        String q ="Raghav";
        String t = new String("Raghav");
        //RAGHAV TO MADHAV
        //s.charAt(0)='m'; Error
        //s.charAt(2)="d"; Error
        s="Madhav";
        System.out.println(s);

    }
}
