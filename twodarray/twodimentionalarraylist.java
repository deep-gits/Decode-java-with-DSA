package twodarray;

import java.util.ArrayList;
import java.util.List;

public class twodimentionalarraylist {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(60);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);

        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);


        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i)+" ");

        }

        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) +" ");

            }
            System.out.println();
            
        }



    }
}
