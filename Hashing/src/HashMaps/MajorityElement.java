package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,5,1};

      //  System.out.println(majority(nums));
        MapMajority(nums);
    }

    static void MapMajority(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);// value = value + 1
            }else {
                map.put(nums[i], 1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > (nums.length/3)){
                System.out.println(key);
            }
        }

    }








    // this method is without using hashMaps which gives O(N^2)
    static ArrayList<Integer> majority(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        int count ;
        for (int i = 0; i < nums.length; i++) {
            count=0;
            for (int j = i; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/3){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
