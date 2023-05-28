package Recursion2;

public class Q3_SumOfDigits {
    public static void main(String[] args) {
        int number = 1342;
        //System.out.println(number/10);

        int sum=0;
        int ans=  DigitSum(number);
        System.out.println(ans);
    }

    static int DigitSum(int n){

        if (n < 1){
            return 0;
        }
        int digit = n%10;
        n = n/10;
        int sum = digit + DigitSum(n);
        return sum;
    }
}
