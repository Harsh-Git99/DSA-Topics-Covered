package Arrays.ArraysMedium;

import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoIndices(arr,target)));
    }

    static int[] twoIndices (int[] arr, int target){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    //int[] ans = {i,j};
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
