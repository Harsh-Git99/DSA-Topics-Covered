package BasicRecursion;

import java.util.ArrayList;

public class AllFactorialNums {
    public static void main(String[] args) {
        long n = 7;
        System.out.println(allFact(24));
    }

    static ArrayList <Long> allFacto(long n ){
        ArrayList<Long> list = new ArrayList<>();
        long a =1;
        list.add(a);

        for (int i = 1; i < n; i++) {
            long facto = i * (i+1);
            if(facto < n){
                list.add(facto);
            }
        }
        return list;
    }


    //while loop
    static ArrayList <Long> allFact(long N ){
        ArrayList<Long> list = new ArrayList<>();
        long n = 1;
        while (fact(n)<=N){
            list.add(fact(n));
            n++;
        }
        return list;
    }

    static long fact(long n){
        if(n==0 || n==1){
            return 1;
        }
        return n* fact(n-1);
    }

}
