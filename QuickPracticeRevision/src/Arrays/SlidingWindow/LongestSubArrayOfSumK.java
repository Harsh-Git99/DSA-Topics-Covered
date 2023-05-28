package Arrays.SlidingWindow;

import java.util.HashMap;

public class LongestSubArrayOfSumK {
    public static void main(String[] args) {
        int[] arr = {1 ,4, 3 ,3 ,5 ,5};
      //  int[] arr = {-13, 0, 6 ,15, 16, 2 ,15 ,-12, 17, -16, 0 ,-3 ,19 ,-3 ,2 ,-9 ,-6};
        int k = 5;

   //     System.out.println(findMaxSubArray(arr,k));
        System.out.println(findMax(arr,k));
    }

    //answer

    static int findMax (int[] arr, int k){
        int i = 0;
        int j = 0;
        int maxL = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(j <  arr.length){
            sum = sum + arr[j];

            if(sum == k){
                maxL = j+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,j);
            }
            if(map.containsKey(sum-k)){
                i = map.get(sum-k);
                if(maxL < (j-i)){
                    maxL = j-i;
                }
            }
            j++;
        }
        return maxL;
    }




    //works on all positive array
    static int findMaxSubArray(int[] arr, int k){
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = 0;

        while(j < arr.length){
            sum = sum + arr[j];

            if(sum < k){
                j++;
            } else if (sum == k) {
                if((j-i+1) > max){
                    max = j-i+1;
                }
                j++;
            }else if (sum > k){
                while(sum > k){
                    sum = sum - arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
