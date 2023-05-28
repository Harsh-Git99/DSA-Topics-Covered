package Arrays.Medium;

import java.util.Arrays;
import java.util.Stack;

public class rearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};

        System.out.println(Arrays.toString(reArrange1(arr)));

        reArrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  int[] reArrange1 (int[] arr){
        int x = 0, y=1;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 ){
                ans[x] = arr[i];
                x=x+2;
            }else {
                ans[y] = arr[i];
                y=y+2;
            }
        }
        return ans;
    }

    static void reArrange(int[] arr){
        Stack<Integer> pos = new Stack<>();
        Stack<Integer> neg = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                pos.push(arr[i]);
            }else neg.push(arr[i]);
        }
        int i = arr.length-1;
        while(!neg.isEmpty()){
            arr[i] = neg.pop();
            arr[i-1] = pos.pop();
            i=i-2;
        }

    }
}
