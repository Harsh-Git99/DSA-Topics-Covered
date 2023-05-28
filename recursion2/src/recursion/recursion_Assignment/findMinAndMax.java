package recursion.recursion_Assignment;

import java.util.Arrays;

public class findMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1,4,3,-5,-4,8,6};

        //putting return as Void
        minMax(arr,0,Integer.MAX_VALUE, Integer.MIN_VALUE);

        // return as int[]
        System.out.println(Arrays.toString(minMax2(arr,0,Integer.MAX_VALUE, Integer.MIN_VALUE)));

        //iterative approach
        //System.out.println(Arrays.toString(min_Max(arr)));

    }

    static void minMax(int[] arr, int i, int min, int max){
        if(i == arr.length){
            System.out.println(min +" "+ max);
            return;
        }

        if(arr[i] < min){
            min = arr[i];
        }
        if(arr[i] > max){
            max = arr[i];
        }

        minMax(arr, i+1, min, max);
    }

    static int[] minMax2(int[] arr, int i, int min, int max){
        if(i == arr.length){
            int[] ans = {min, max};
            return ans ;
        }

        if(arr[i] < min){
            min = arr[i];
        }
        if(arr[i] > max){
            max = arr[i];
        }

        return minMax2(arr,i+1,min,max);


    }



    //iterative approach
    static int[] min_Max(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return new int[]{min,max};
    }
}
