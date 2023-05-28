package LinearSearch;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the target value");
        int target = in.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int ans = linearSearch(arr, target);
        System.out.println("The target value is at index "+ans);

        int an = liSearch(arr, target);
        System.out.println("The target value is  "+an);

    }

    static int linearSearch( int[] arr, int target ){


        for (int i = 0; i < arr.length; i++) {
            // check the element  at every index if it is == target
            int element = arr[i];
            if (element == target){
                return i ;
            }
        }

        //this line will execute if none of the above-mentioned return statements have executed
        //that is, the target not found

        return -1;
    }

    static int liSearch (int[] arr, int target){

        for (int element : arr) {
            // check the element  at every index if it is == target, return target
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}