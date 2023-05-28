package Recursion2;

public class Q1_Number {
    public static void main(String[] args) {
        int n=5;
        Num(5);
        System.out.println("-------------------");
        Num2(n);
    }

    static void Num(int n){

        if(n==0){
            return;
        }
        System.out.println(n);      //prints before entering the next recursion
        Num(n-1);
        System.out.println(n);       //prints after exiting from the next recursion
    }

    static  void Num2(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Num2(--n);
    }
}
