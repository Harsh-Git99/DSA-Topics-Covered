package Recursion2;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palin(12456421));
    }

    static boolean palin (int n){
        return n == rev(n);

        }


    static  int rev(int n){

        int digits = (int)(Math.log10(n))+1;    //gives the number to be put as power of 10
        return helper(n,digits);
    }

    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem= n%10;

        return rem * (int)Math.pow(10,digits-1) + helper(n/10, digits-1); // 4 * 1000 + 3 * 100 + 2 * 10 + 1 = 4321
    }
}
