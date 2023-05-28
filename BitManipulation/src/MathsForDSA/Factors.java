package MathsForDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {

        factors3(20);
    }

    static void factors(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }

    static  void factors2 (int n){

        int c =1;

        while ( c*c <= n){
            if (n%c == 0) {
                if (n / c == c) {
                    System.out.println(c + " ");
                } else {
                    System.out.print(c + " " + n / c + " ");
                }
            }
            c++;
        }

    }


    // to arrange the answer of factor3
    // This will give both space and time complexity  =  0(sqroot (n))
    static  void factors3 (int n){

        int c =1;
        ArrayList<Integer> list = new ArrayList<>();
        while ( c*c <= n) {
            if (n % c == 0) {
                if (n / c == c) {
                    System.out.println(c + " ");
                } else {
                    System.out.print(c + " ");
                    list.add(n / c);
                }
            }
            c++;
        }
        for (int i = list.size()-1 ; i >= 0 ; i--) {
            System.out.print(list.get(i)+" ");

        }

    }
}
