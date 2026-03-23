package Hashing;


import java.util.HashMap;

public class Basic {
    public static void main(String[] args) {
        HashMap<String,Integer> d=new HashMap<>();
        d.put("india",100);
        d.put("china",150);
        d.put("us",50);

        System.out.println(d);

        int population=d.get("us");
        System.out.println(population);

        System.out.println(d.containsKey("china"));
        System.out.println(d.containsKey("india"));

        //remove
        d.remove("india");
        System.out.println(d.containsKey("india"));

        System.out.println(d.size());

        System.out.println(d.isEmpty());

        d.clear();
        System.out.println(d.isEmpty());

    }
}
