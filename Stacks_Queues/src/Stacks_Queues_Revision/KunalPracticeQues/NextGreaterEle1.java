package Stacks_Queues_Revision.KunalPracticeQues;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterEle1 {
    public static void main(String[] args) {
        int[] arr1 = {3,1,5,7,9,2,6};
        int[] arr2 = {1,2,3,5,6,7,9,11};

        //System.out.println(Arrays.toString(nextGreater(arr1,arr2)));
        System.out.println(Arrays.toString(nextGreater1(arr1,arr2)));

    }

    //optimized
    static int[] nextGreater1(int[] quary , int[] nums ){

        //find the next greater element on right from nums;
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[nums.length];
        for (int i = nums.length-1; i >=0 ; i--) {
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && nums[i] >= stack.peek()){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    arr[i] = stack.peek();
                }else{
                    arr[i] =-1;
                }
                stack.push(nums[i]);
            }else{
                stack.push(nums[i]);
                arr[i] = -1;

            }
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(nums[i], arr[i]);
        }
        for (int i = 0; i < quary.length; i++) {

            quary[i] = map.get(quary[i]);

        }
        return quary;


    }











    static int[] nextGreater (int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            //check if target from arr1 exist in arr2
            int j = searchIndex(arr2,arr1[i]);
            if(j == -1 || j == arr2.length-1){
                arr1[i] = -1;
            }else{
                for (int k = j+1; k < arr2.length; k++) {
                    if(arr2[k] > arr1[i]){
                            arr1[i] = arr2[k];
                            break;
                        } else if (k < arr2.length-1 && arr2[k] <= arr1[i]) {
                        continue;
                    }else{
                        arr1[i] = -1;
                    }

                    }

                }
            }

        return arr1;
    }

    static int searchIndex(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
