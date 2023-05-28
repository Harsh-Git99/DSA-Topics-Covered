package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
       // print(1);
        //number (50, 0);
        System.out.println( number (5, 0));
    }
    static void print(int n){
        System.out.println(n);

        //Base condition which tells recursion to stop making new calls
        if (n==5){
            return;
        }
        //recursive call
        // if you are calling a func again and again, you can treat it as a separate call in the stack
        print(n+1);
    }

    static int number (int num, int sum){

        if(num==0){
            return sum;
        }
        int newSum = sum+num;
        int newNum = num-1;
        return number(newNum, newSum);


    }

}
