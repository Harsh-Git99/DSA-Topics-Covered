package Arrays.Medium;

import java.util.Arrays;

public class sortInPlaceZero_One_Two {
    public static void main(String[] args) {
        int[] arr = {2,0,1};

        sortZero_Two(arr);

//        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sortZero_Two(int[] arr){
        int indexZero = 0, indexTwo = arr.length-1, i =0;
        while (i <= indexTwo){
            if(arr[i] == 0){
                //swap
                swap(arr,i++,indexZero++);
            }
            else if(arr[i] == 2){
                //swap
                swap(arr,i,indexTwo--);
            }else i++;
        }
    }

    static void swap(int[] arr, int i, int zero){
        int temp = arr[i];
        arr[i] = arr[zero];
        arr[zero] = temp;
    }


    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max element index
            int max = maxElement(arr,i);

                //swap
                int temp = arr[max];
                arr[max] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
        }
    }

    static int maxElement(int[] arr, int j){
        int max = 0;
        for (int i = 0; i < arr.length-j; i++) {
            if(arr[max] <= arr[i]){
                max = i;
            }
        }
        return max;
    }
}
