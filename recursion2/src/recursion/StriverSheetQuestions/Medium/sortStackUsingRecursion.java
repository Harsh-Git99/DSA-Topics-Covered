package recursion.StriverSheetQuestions.Medium;

import java.util.Arrays;
import java.util.Stack;

public class sortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        //11 2 32 3 41
        s.push(41);
        s.push(3);
        s.push(32);
        s.push(2);
        s.push(11);

        System.out.println(sort(s));

//        int[] arr = {11, 2, 32, 3 ,41};
//        int[] ans = MergeSort(arr);
//        System.out.println(Arrays.toString(ans));

    }

    static Stack<Integer> sort(Stack<Integer> s)
    {
        int[] arr = new int[s.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.pop();
        }
        //Arrays.sort(arr);
        //sort the array

        int[] ans = MergeSort(arr);


        for (int i = 0; i < ans.length ; i++) {
            s.push(ans[i]);
        }
        return s;

    }

    static int[] MergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] a1 , int[] a2){
        int[] mix = new int[a1.length+a2.length];
        int i = 0, j = 0, k=0;
        while(i < a1.length && j <a2.length){
            if(a1[i] > a2[j] ){
                mix[k] = a1[i];
                k++;
                i++;
            }
            else if(a1[i] < a2[j] ){
                mix[k] = a2[j];
                k++;
                j++;
            }
        }

        while(i < a1.length){
            mix[k] = a1[i];
            k++;
            i++;
        }
        while(j < a2.length){
            mix[k] = a2[j];
            k++;
            j++;
        }
        return mix;
    }

}
