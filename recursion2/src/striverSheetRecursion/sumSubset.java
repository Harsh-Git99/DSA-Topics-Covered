package striverSheetRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sumSubset {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(1);
        arr.add(2);
        System.out.println(subsetSums (arr,arr.size()));

    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here

        ArrayList<Integer> ans = new ArrayList<>();

        sums(arr,0,0,ans);

        Collections.sort(ans);

        return ans;
    }

    static void sums (ArrayList<Integer> arr, int sum, int index,ArrayList<Integer> ans ){

        if(index == arr.size()){
            ans.add(sum);
            return ;
        }

        sum += arr.get(index);
        sums(arr,sum,index+1,ans);
        sum -= arr.get(index);
        sums(arr,sum,index+1,ans);
    }
}
