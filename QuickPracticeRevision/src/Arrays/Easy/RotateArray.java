package Arrays.Easy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotateInPlace2(arr,k);

       // rotateInPlace(arr,k);
        //rotate(arr,k);


    }

    static void rotateInPlace2(int[] arr, int k){

            int n = arr.length;
            k = k%n;

            reverse(arr,0,n-1);
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);


            System.out.println(Arrays.toString(arr));




    }

    static void reverse(int[] arr,int s, int e){

       while (s < e){
           int temp = arr[s];
           arr[s] = arr[e];
           arr[e] = temp;
           s++;
           e--;
       }
    }






    static void rotateInPlace(int[] arr, int k){

        //reverse the first half
        int i=0;
        int j = k;
        while(i < j){
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        //reverse the second half
        int p=k+1;
        int q = arr.length-1;
        while(p<q){
            //swap
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }

        //reverse the whole array
        int x=0;
        int y = arr.length-1;
        while(x<y){
            //swap
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }
        System.out.println(Arrays.toString(arr));
    }


    //Not inPlace
    static void rotate(int[] arr, int k){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[(i+k+1)%arr.length];
        }
        System.out.println(Arrays.toString(ans));
    }
}
