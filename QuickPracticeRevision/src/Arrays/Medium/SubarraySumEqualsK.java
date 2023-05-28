package Arrays.Medium;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {-13 ,0, 6 ,15, 16, 2 ,15, -12, 17 ,-16, 0 ,-3 ,19 ,-3 ,2 ,-9 ,-6};
        int k = 15;

        System.out.println(numOfSubArrays(arr,k));
    }

    static int numOfSubArrays(int[] arr, int k){

        int sum = 0;
        int maxL = 0;
        int Length = 0;

        HashMap<Integer,Integer> map = new HashMap<>();


        for (int l = 0; l < arr.length; l++) {
            sum += arr[l];
            if(sum == k){
                maxL = Math.max(maxL,l+1);
            }
            int x = sum - k;
            if(!map.isEmpty() && map.containsKey(x)){
                Length = l - map.get(x) ;
                maxL = Math.max(Length,maxL);
            }
            if(!map.containsKey(sum)){
                map.put(sum , l);
            }
        }
        return maxL;
    }
}
