package BinarySearch.medium;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {805306368,805306368,805306368};
        int h = 1000000000;

        System.out.println(minEatingSpeed(arr,h));
    }

    static int minEatingSpeed(int[] arr, int h){
        int start = 1;
        int end = Integer.MAX_VALUE;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(canEatInTime(arr, h ,mid)) end = mid-1;
            else start = mid+1;
        }
        return start;
    }

    static boolean canEatInTime(int[] arr, int h, int k) {
        int hour = 0;

        for(int pile : arr){
            int div = pile/k;
            hour = hour+div;
            if(pile % k != 0) hour++;
        }
        return hour<=h;
    }

}
