package Arrays.ArraysEasy;

import java.util.Arrays;

public class ZeroesAtEnd {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};

        System.out.println(Arrays.toString(swapZeroes(arr)));       //leetCode inspired
        System.out.println(Arrays.toString(zeroesAtEnd(arr)));      // self-approach
        System.out.println(Arrays.toString(zeroesAtEndTemp(arr)));  // bruteForce



    }
    static int[] swapZeroes ( int[] arr){
       int noOfZeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                noOfZeroes +=1;
            } else if(noOfZeroes > 0 ) {
                //swap
                int temp = arr[i];
                arr[i] = 0;
                arr[i-noOfZeroes]=temp;         // if i ==3 and noOfZeroes = 2, the nonZero element will be placed at 3-2 = 1 index
            }
        }
        return arr;
    }

    static int[] zeroesAtEnd (int[] arr){
        int j = 0;
        int i =0;
       while (i < arr.length) {
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
            i++;
            if(i == arr.length){
                while(j < arr.length){
                    arr[j] =0;
                    j++;
                }
                return arr;
            }
        }
        return arr;
    }
    static int[] zeroesAtEndTemp (int[] arr){
        int [] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        return temp;

    }
}
