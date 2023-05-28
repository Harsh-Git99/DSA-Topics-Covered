package Arrays.ArraysEasy;
import java.util.Arrays;


public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,3,7,8};
        int [] arr2 = {9,6,4,2,3,5,7,0,1};
        //System.out.println(Arrays.toString(sort(arr)));
        System.out.println(missingNum(arr));
        System.out.println(missingNum2(arr2));
        System.out.println(missing(arr2));


    }
    static int missingNum ( int[] arr){
        sort(arr);
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != j){
                return j;
            }else
                j++;
        }
        return j;
    }

    static  int [] sort ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    static int missingNum2 ( int[] arr){
        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != j){
                return j;
            }else
                j++;
        }
        return j;
    }

    static int missing (int[] arr){
        int n = arr.length;
        int s = (n*(n+1))/2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int missingNum = s-sum;
        return missingNum;
    }
}
