package BasicMaths;

import java.util.ArrayList;
import java.util.Arrays;

public class AllDivisors {
    public static void main(String[] args) {
        int num = 100;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
               // System.out.print(i+" ");
                list.add(i);
                if (i != num / i) {
                    // System.out.print(num/i + " ");
                     list.add(num/i);

                }
            }
        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        sort(arr);
        System.out.println(Arrays.toString(arr));



    }
    static int [] sort (int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i ; j++) {

                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j- 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}



