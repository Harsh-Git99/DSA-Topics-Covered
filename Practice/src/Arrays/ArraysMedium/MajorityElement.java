package Arrays.ArraysMedium;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums = {3,3,4};
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.replace(nums[i], map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
        }
        int max = 0;
        int majority=0;
        for(int key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                majority = key;
            }

        }


        return majority;
    }
}
