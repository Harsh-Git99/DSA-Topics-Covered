package Arrays_Revision;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int [] arr= {5,7,7,8,8,10};
        int ele = 10;

        System.out.println(Arrays.toString(positions(arr,ele)));
    }


    static  int[] positions(int[] arr, int ele){
        int first = firstOcc(arr,ele);
        int last = lastOcc(arr, ele);

        return new int[]{first, last};

    }

    static int firstOcc (int[] arr, int ele){
        int start = 0;
        int end = arr.length-1;
        int firstOcc = -1;

        while(start <= end ){
            int mid = start + (end -start)/2;

            if(arr[mid] == ele){
                firstOcc = mid;
                end = mid-1;
            }else if (arr[mid] > ele){
                end = mid-1;
            }else start = mid+1;
        }
        return firstOcc;
    }

    static int lastOcc (int[] arr, int ele){
        int start = 0;
        int end = arr.length-1;
        int lastOcc = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == ele){
                lastOcc = mid;
                start = mid+1;
            } else if (arr[mid] > ele) {
                end = mid-1;
            }else start = mid+1;
        }
        return lastOcc;
    }
}
