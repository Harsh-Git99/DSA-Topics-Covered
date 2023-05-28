package LeetCodeWeekly;

import java.util.Arrays;

import static java.util.Arrays.*;

public class slidingSubArrayBeauty {
    public static void main(String[] args) {
        int[] arr = {1,-1,-3,-2,3};
        System.out.println(Arrays.toString(getBeauty(arr, 3, 2)));
    }

    static int[] getBeauty(int[] arr, int k ,int x ){
        int i = 0;
        int j = 0;
        int[] ans = new int[arr.length-k+1];

        while(j < arr.length){

            //int[] temp = Arrays.copyOfRange(arr,i,j+1);

            if( (j-i+1)  < k ) j++;

            else if((j-i+1) == k){
                int[] temp = Arrays.copyOfRange(arr,i,j+1);
                Arrays.sort(temp);
                if(temp[x-1]>0){
                    ans[i] = 0;
                }else ans[i] = temp[x-1];

                j++;
                i++;

            }

        }
        return ans;
    }
}
