package Recursion7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetUsingIteration {
    public static void main(String[] args) {

        int [] arr = {1,2,2};
        List<List<Integer>> ans = SubsetDuplicate(arr);

        //System.out.println(ans);

        // to print every inner list separately
        for (List<Integer> list: ans ){
            System.out.println(list);
        }
    }

  //  it's returning a list that contains a list of integers
    static List<List<Integer>> Subset (int [] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());// new empty list has been added to the outerList

        for (int num : arr){
            int size = outer.size();

            //for every number, the size number of outer list is, that many list will be created.
            for (int i = 0; i < size; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                // to create a copy of the i'th list, we use outer.get(i)
                //Now this internal will be a copy of the outer.get(i)

                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }



    // subset for duplicate elements
    static List<List<Integer>> SubsetDuplicate (int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());// new empty list has been added to the outerList

        int start =0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size()-1;
            int size = outer.size();

            //for every number, the size number of outer list is, that many list will be created.
            for (int j = start; j < size; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                // to create a copy of the i'th list, we use outer.get(i)
                //Now this internal will be a copy of the outer.get(i)

                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
