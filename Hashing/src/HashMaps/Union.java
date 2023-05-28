package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        unionElements(arr1, arr2);

        System.out.println();
        unionTotalNumOfElements(arr1,arr2);
    }

    static void unionElements(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length ; i++) {
            if (i < arr1.length - 1 && map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i] + 1));
            } else map.put(arr1[i], 1);
        }
        for (int i = 0; i < arr2.length ; i++){
            if (i > arr1.length - 1 && map.containsKey(arr2[i])) {
                map.put(arr2[i], map.get(arr2[i] + 1));
            } else map.put(arr2[i], 1);
        }

        for(int key : map.keySet()){
            System.out.print(key + " ");
        }
    }

    static void unionTotalNumOfElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length ; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length ; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Total num of union elements are : " +  set.size());
    }
}
