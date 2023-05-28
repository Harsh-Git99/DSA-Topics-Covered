package Recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println( fibo (3));

    }

    static int fibo(int n){

        //Base Condition
        if (n<2){
            return n;
        }
          return fibo(n-1)+fibo(n-2);
    }
}
