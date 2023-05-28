package LeetCodeWeekly;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPrimeNumbersInRange {
    public static void main(String[] args) {
        int left = 19;
        int right = 31;

        //System.out.println(isPrime(37));

        System.out.println(Arrays.toString(closestPrime(left, right)));

    }

    static int[] closestPrime(int l, int r){
        int[] ans = new int[2];

        ArrayList<Integer> list = allPrimes(l,r);
        if(list.size() <=1 ) return new int[]{-1,-1};
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int newMin = list.get(i) - list.get(i-1);
            if(newMin  < min ){
                min = newMin;
                ans[0] = list.get(i-1);
                ans[1] = list.get(i);
            }
        }
        return ans ;
    }

    //all the prime num from l to r
    static ArrayList<Integer> allPrimes(int s, int e){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = s; i <= e ; i++) {
            if(isPrime(i)) list.add(i);
        }

        return list;
    }

    static boolean isPrime(int num){
        if(num == 1 ) return false;

        for (int i = 2; i*i <= num ; i++) {
            if(num % i  == 0){
                return false;
            }
        }
        return true;
    }
}
