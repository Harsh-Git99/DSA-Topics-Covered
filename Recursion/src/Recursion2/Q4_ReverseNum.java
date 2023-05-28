package Recursion2;

public class Q4_ReverseNum {
    public static void main(String[] args) {
        int n = 1234;

         Reverse(n);
        System.out.println(num);

        System.out.println(rev(6757));
    }
    static int num = 0;
    static void Reverse(int n){

        if (n==0) {
            return ;
        }

        int digit = n % 10;

        num = num * 10 + digit;
        Reverse(n/10);

    }

    //using helper function

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
