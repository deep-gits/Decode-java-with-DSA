package Hashing;

import java.util.HashMap;
import java.util.Set;

public class iterationinhashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> d=new HashMap<>();
        d.put("india",100);
        d.put("china",150);
        d.put("us",50);
        d.put("indonasia",100);
        d.put("nepal",150);
        d.put("Sri lanka",50);

        //iterate
        Set<String> keys=d.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.println("key="+k+",value="+d.get(k));
        }
    }
}

