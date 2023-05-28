package Recursion2;

public class Q2_Factorial {
    public static void main(String[] args) {
       // fact(5);
        System.out.println(fact(5));
    }

    static int fact(int n){
        // **return_type** is same as the return value we expect from recursion function.

        if (n==0){
            return -1;
        }
        if(n==1){
            return 1;
        }
        //int fact = 1;
        int facto = n * fact(n-1);
        return facto;
    }
}
