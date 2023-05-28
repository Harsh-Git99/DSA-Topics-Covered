package CyclicSort;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] arr={3,4,-1,1};


        System.out.println(missingPositive(arr));
    }

    static int missingPositive(int [] arr){
        int last= arr.length;
        int i =0;
        while (i < last){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i]<=arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else
                i++;
        }
        // search for  first missing number

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                return index+1;
            }
        }
        //case2
        return arr.length+1;
    }

    static void swap (int [] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
}
