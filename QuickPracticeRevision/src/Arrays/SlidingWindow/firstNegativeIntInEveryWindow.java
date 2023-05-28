package Arrays.SlidingWindow;

import java.util.*;

public class firstNegativeIntInEveryWindow {
    public static void main(String[] args) {
        long[] arr = {12,-1,-7,8,-15,30,16,28};
        int k =3;

        System.out.println(Arrays.toString(getNveOfEveryWindow(arr,k)));

    }

    static long[] getNveOfEveryWindow(long[] arr, int k){
        int i = 0;
         int j = 0;
         Queue<Long> queue = new LinkedList<>();
        long[] ans = new long[arr.length-k+1];
         while(j < arr.length){
             // till the window is not created
             if((j-i+1)<k){
                 if(arr[j] < 0 ){
                     queue.add(arr[j]);
                 }
                 j++;
             }else if((j-i+1) == k){
                 if(arr[j] < 0) queue.add(arr[j]);

                 if(queue.isEmpty()){
                     ans[i]=0;

                     //break;
                 }else{
                     ans[i] = queue.peek();
                     if(arr[i] == queue.peek()){
                         queue.remove();
                     }
                 }


                 j++;
                 i++;
             }

         }
         return ans;
    }



    static int[] getNegOfEveryWind(int[] arr, int k){
        int i = 0;
        int j = 0;

        int b = 0;

        int[] ans = new int[arr.length-k+1];
        System.out.println(ans.length +"ans");
        while(j < arr.length){
            if((j-i+1) < k){
                j++;
            }
            else if((j-i+1) == k){

                int a = i;
                while(a <= j){
                    if(arr[a] < 0) {
                        ans[b] = arr[a];
                        b++;
                        break;
                    }if(a==j && ans[b] ==0) b++;
                    a++;

                }

                j++;
                i++;
            }
        }
        return ans;
    }
}
