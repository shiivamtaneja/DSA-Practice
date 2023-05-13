package Collections.Set;

import java.util.*;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // add ele
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

        // Search
        if(set.contains(1)) {
            System.out.println("It exsists");
        }
        

        // del
        set.remove(1);
        System.out.println(set);

        // Iterator
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }


    }
}
