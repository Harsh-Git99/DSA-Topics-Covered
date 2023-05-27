package Arrays_Revision;

import java.util.HashMap;
import java.util.HashSet;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k =3;

        System.out.println(subArrays(arr,k));
    }

    static  int subArrays(int[] arr, int k){
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
