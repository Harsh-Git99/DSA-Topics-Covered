package Arrays.extra;

import java.util.HashMap;

public class Fest_Posters {
    public static void main(String[] args) {
        int[] time = {2, 3, 1, 4};
        int poster = 10;
        System.out.println(minTime2(time,poster));
    }

    static int minTime2(int[] time, int poster){
        int t = 0;


        return t;
    }






    static int minTime(int[] time, int poster){
        int t = 0;
        int p = 0;
        while (p < poster){
            t++;
            for (int i = 0; i < time.length; i++) {
                if( t % time[i] == 0 || time[i] == 1){
                    p++;
                }
            }

        }
        return t;
    }
}
