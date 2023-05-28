package recursionRevision;

import java.util.ArrayList;
import java.util.Arrays;

public class extra1 {
    public static void main(String[] args) {

        System.out.println(meetThem(1,3,9));

    }




    //brute force
    static long meetThem(long A, long B, long C){

        long max = Math.max(A,B);
        long min = Math.min(A,B);
        long count=0;
        long ans = max ;

        if( max == 0){  // here both max and min are zero
            return C;
        } else if (min == 0) {
            return C/max;
        }else {
            while (ans <= C){
                if(ans%min ==0){
                    count++;
                }
                ans+=max;
            }
        }
        return count;
    }
}
