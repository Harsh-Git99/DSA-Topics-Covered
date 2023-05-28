package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String st = "Kunal the forest ranger";
        char target = 'f';
         char[] ans = st.toCharArray();
        System.out.println(Arrays.toString(ans));

        System.out.println("Enter range start");
        int start = in.nextInt();
        System.out.println("Enter range end");
        int end = in.nextInt();
        inRange(ans, start, end, target);

    }

    static  void inRange( char[] ans, int st, int ed, char trgt){

        for (st = 0 ; st <= ed; st++) {

            int ele = ans[st];
            if ( ele == trgt){
                System.out.println(st);
            }


        }

    }
}
