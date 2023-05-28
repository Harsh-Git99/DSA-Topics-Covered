package Functions;

import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String greeting = in.nextLine();        // to scan the entire string line

        System.out.println(greet (greeting));


        int ans = sum3(20,30);
        System.out.println(ans);


    }
    static String greet (String g){
        //System.out.println(g);
        String intro = "Hello, this is Harsh. " + g;
        return intro;
    }


    static int sum3 (int a , int b){
        int sum = a+b;
        return sum;
    }



}
