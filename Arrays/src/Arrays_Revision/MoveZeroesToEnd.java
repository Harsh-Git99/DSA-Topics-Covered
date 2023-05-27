package Arrays_Revision;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        move(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void move (int[] arr){
        int i =0, j=0;

        while(i<arr.length){
            if(arr[i] != 0){
                arr[j]=arr[i];
                j++;
            }
            i++;

            if(i == arr.length){
                while(j != i){
                    arr[j] = 0;
                    j++;
                }
            }
        }
    }
}
