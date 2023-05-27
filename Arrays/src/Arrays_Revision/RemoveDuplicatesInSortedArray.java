package Arrays_Revision;

import java.util.Arrays;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(isReturnKth(arr));

        System.out.println(Arrays.toString(arr));
    }

    static  int isReturnKth (int[] arr){

        int addNew =1;   //index where the new element will be put
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                arr[addNew] = arr[i];
                addNew++;
            }
        }
        return addNew;
    }
}
