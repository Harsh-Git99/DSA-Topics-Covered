package BinarySearch.medium;

public class sqrtOfNumOrOfitsFloor {
    public static void main(String[] args) {
        long num = 5;
       // System.out.println(floorSqrt(num));
       // System.out.println(perfectSq(36));
        System.out.println(floorSqrtBS(35));


    }

    static long floorSqrtBS(long x){
        long start = 0;
        long end = x;
        while(start <= end){
            long mid = (start + end)/2;

            if(mid * mid == x){
                return mid;
            } else if (mid*mid < x) {
                start = mid +1;
            }else
                end=mid-1;
        }
        return end;
    }


    static long floorSqrt(long x){

        while(!perfectSq(x)){
            x--;
        }
        for (int i = 0; i*i <= x; i++) {
            if(i*i == x){
                return i;
            }
        }
        return -1;
    }

    static boolean perfectSq(long x){

        for (int i = 1; i*i <= x; i++) {
            if(i*i == x){
                return true;
            }
        }
        return false;
    }

    static int perfectSqUsingMethSqrt(long x) {
        int n = 4;

        // using the sqrt function of math
        // module finding the square root integer
        return ((int)Math.sqrt(n));
    }

}
