package Collections.List;

import java.util.*;


public class Array_List {
        
    public static void main(String[] args) {
        
        // Integer | String | Boolean
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // Get elements
        System.out.println(list.get(1));

        // Add elements in b/w
        list.add(1, 1);
        System.out.println(list);


        // Set elements
        list.set(0, 69);
        System.out.println(list);
        
        // Delete elements
        list.remove(2);
        System.out.println(list);
    

        System.out.println("List size : " + list.size());

        // Loops
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
