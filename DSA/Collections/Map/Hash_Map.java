package Collections.Map;

import java.util.*;

public class Hash_Map {

    public static void main(String[] args) {

        // // Key, value Pair
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // // Insertion
        hashMap.put(1, 2);
        hashMap.put(2, 2);
        hashMap.put(4, 2);
        hashMap.put(3, 2);
        System.out.println(hashMap);

        // Search
        // if (hashMap.containsKey(1)) {
        //     System.out.println("Present");
        // } else {
        //     System.out.println("Not Present");
        // }
        // Find the value of element
        // System.out.println(hashMap.get(1));

        // Iteration
        // int arr[] = {1, 2, 3};
        // // 1 :-
        // System.out.println("Method 1");
        // for(int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // // 2 :-
        // System.out.println("Method 2");
        // for(int value : arr) {
        // System.out.print(value + " ");
        // }
        // System.out.println();

        // Method 1 - entrySet() - Creates a set of all the entries of hashMap
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            System.out.println("Value of e is: " + e);
            System.out.println("Key is : " + e.getKey());
            System.out.println("Value is : " + e.getValue());
        }

        // Method 2 - keySet() - Creates a set of only the keys of hashMap
        // Set<Integer> keys = hashMap.keySet();
        // for(Integer key : keys ) {
        // System.out.println(key + " " + hashMap.get(key));
        // }

        // Remove
        // hashMap.remove(1);
        // System.out.println(hashMap);
    }
}
