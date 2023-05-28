package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr ={0,0,1,-1};

        System.out.println(longest(arr));

        //System.out.println(longest_Repeating(arr));

    }

//    static int longest_Repeating(int[] arr){
//        Arrays.sort(arr);
//
//        HashSet<Integer> set = new HashSet<>();
//        for (int ele : arr){
//            set.add(ele);
//        }
//        int[] ans = new int[set.size()];
//        int j = 0;
//        for (int ele : set.stream().toList()){
//            ans[j] = ele;
//            j++;
//        }
//
//        int result = longest(ans);
//        return result;
//
//    }



    //works for non-repeating elements;
    static int longest(int[] arr){
        //sort the array

        Arrays.sort(arr);

        int count = 1, maxCount = 1;
        for (int i = 0; i < arr.length-1; i++) {

            if( arr[i]+1 == arr[i+1] ){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            } else if (arr[i] == arr[i+1]) {
                continue;
            } else count = 1;

        }

        return maxCount;
    }
}
