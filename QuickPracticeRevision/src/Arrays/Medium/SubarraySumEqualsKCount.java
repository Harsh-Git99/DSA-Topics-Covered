package Arrays.Medium;

import java.util.HashMap;

public class SubarraySumEqualsKCount {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        int k = 0;
        System.out.println(subarraySum(arr,k));
    }

    static int subarraySum(int[] arr, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
            if(sum == k){
                count++;
            }
            int x = sum - k;
            if(!map.isEmpty() && map.containsKey(x)){
                count++;
            }
            if(!map.containsKey(sum)){
                map.put(sum, i );
            }
        }
        if( map.size()==1 && map.containsKey(0) ){
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length  ; j++) {
                    c++;
                }
            }
            return c;
        }

        return count;
    }
}
