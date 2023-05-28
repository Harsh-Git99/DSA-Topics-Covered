package recursion.StriverSheetQuestions.Medium;

import java.util.Arrays;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        //11 2 32 3 41
        s.push(41);
        s.push(3);
        s.push(32);
        s.push(2);
        s.push(11);

        System.out.println(sort(s));

//        int[] arr = {5,7,9,2,3,4,6};
//
//        sortArray(arr);
//        System.out.println(Arrays.toString(arr));


    }

    static Stack<Integer> sort(Stack<Integer> s)
    {
        int[] arr = new int[s.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.pop();
        }
        //Arrays.sort(arr);
        //sort the array
        sortArray(arr);

        for (int i = 0; i < arr.length ; i++) {
            s.push(arr[i]);
        }
        return s;

    }

    static void sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find max between i -> n
            for (int j = i; j < arr.length; j++) {
                //find max
                int max = MaxIndex(arr, j);

                //swap with the
                int temp = arr[j];
                arr[j] = arr[max];
                arr[max] = temp;
            }
        }
    }

    static int MaxIndex(int[]arr,int st){
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = st; i < arr.length ; i++) {
            if(max < arr[i] ){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
