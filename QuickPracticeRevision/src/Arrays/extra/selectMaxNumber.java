package Arrays.extra;

import java.util.Arrays;

public class selectMaxNumber {
    public static void main(String[] args) {
        int[] arr = {7, -9, -8, 0 ,-9, -4, 0 ,-5, 3};
//        int[] arr = {-7, 5, 8, -8};

        System.out.println(Arrays.toString(findDifferenceArray(arr)));
    }

    static int[] findDifferenceArray(int arr[]){
        if(arr.length == 1){
            int[] ans  = new int[arr.length];
            ans[0]=0;
            return ans;
        }
        int[] ans = new int[arr.length];

        int[] rMin = new int[arr.length];
        int[] lMin = new int[arr.length];

        lMin[0] = 0;
        int sum = Integer.MAX_VALUE ;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < sum){
                sum = arr[i];
                if(i < arr.length-1) {
                    lMin[i + 1] = sum;
                }else lMin[i ] = sum;
            }else lMin[i+1] = sum;
        }
        System.out.println(Arrays.toString(lMin));



        rMin[arr.length-1] = 0;

        int sum2 = Integer.MAX_VALUE ;
        for (int i = arr.length-1; i >0; i--) {
            if(arr[i] < sum2){
                sum2 = arr[i];

                rMin[i-1] = sum2;
            }else rMin[i-1] = sum2;
        }
        System.out.println(Arrays.toString(rMin));

        for (int i = 0; i < ans.length; i++) {
            int sum3 = lMin[i] - rMin[i];
            ans[i] = sum3;
        }

        return ans;
    }

}
