package recursion.Subset_Subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSeqIteratively {
    public static void main(String[] args) {
        int[] arr = {1,2,2};

       // System.out.println( subSets(arr));
        System.out.println(subSetsDuplicates(arr));
    }

    static List<List<Integer>> subSets(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int ele : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> listInternal = new ArrayList<>(outer.get(i));
                listInternal.add(ele);
                outer.add(listInternal);
            }
        }
        return outer;

    }

    static List<List<Integer>> subSetsDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0 ;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if(i> 0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;

    }
}
