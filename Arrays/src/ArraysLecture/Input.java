package ArraysLecture;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int l = in.nextInt();
        int [] arr = new int [l];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter data number "+i+" :");
            arr[i]=in.nextInt();
        }
        System.out.println("The array is " + Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] +" ");
//        }
        //OR
        for (int j : arr) {         //for each element in array, print the element
            System.out.print(j + " ");      //here "num" represents element of the array
        }
    }
}
