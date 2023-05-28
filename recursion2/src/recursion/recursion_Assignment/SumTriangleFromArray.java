package recursion.recursion_Assignment;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] ans = new int[arr.length-1];
        formTriangle2(arr,0, ans,0);
    }



    static void formTriangle2(int[] arr , int i, int[] ans, int j){
        if(arr.length == 1){
            return;
        }
        else if(i == arr.length-1){
            int[] newArray =  new int[i-1];
            System.out.println(Arrays.toString(ans));

            formTriangle2(ans,0, newArray,0);

        }else if(i < arr.length) {

            ans[j] = (arr[i] + arr[i + 1]);
        }
        else{
            return;
            }

        formTriangle2(arr,i+1, ans,j+1 );
    }

}
