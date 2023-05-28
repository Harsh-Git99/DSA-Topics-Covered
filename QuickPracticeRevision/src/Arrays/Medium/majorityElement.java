package Arrays.Medium;

import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};

        System.out.println(findMajority(arr));
    }

    static int findMajority(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else if(map.containsKey(arr[i])){
                map.replace(arr[i],map.get(arr[i])+1);
            } if(map.get(arr[i]) > (arr.length/2)) {
                return arr[i];
            }
        }

        return -1;
    }
}
