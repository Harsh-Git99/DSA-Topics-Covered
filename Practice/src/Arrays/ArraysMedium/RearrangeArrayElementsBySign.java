package Arrays.ArraysMedium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
     int[] arr = {3,1,-2,-5,2,-4};

        //System.out.println(Arrays.toString(reArrangeArray(arr)));
        System.out.println(Arrays.toString(reArrange(arr)));
    }
    //optimized

    static int[] reArrange(int[] arr){
        int[] ans = new int[arr.length];
        int indexP = 0, indexN = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                ans[indexP] = arr[i];
                indexP += 2;
            }else{
                ans[indexN] = arr[i];
                indexN += 2;
            }
        }
        return ans;
    }

    //bruteForce
    static int[] reArrangeArray(int[] arr){
        int[] ans = new int[arr.length];
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                q1.add(arr[i]);
            }else
                q2.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = q2.remove();
            ans[i+1] = q1.remove();
            i++;
        }
        return ans;
    }


}
