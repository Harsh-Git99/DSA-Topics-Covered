package recursion.BasicsChap1;

public class reverseNum {

    static  int sum = 0;//here we have taken an external variable which will keep on updating as we use the recursion function
    static void reverse1 (int num){

        if(num == 0){
            return ;
        }
        int rem = num%10;
        sum = sum * 10 + rem;       //from here we are updating the values of sum.
        reverse1(num/10);
    }

    static int reverse2(int n){
        // no of digits

        int digits = (int) (Math.log10(n)) ;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == 0){
            return n ;
        }
        int rem = (n%10);
        return rem * (int)Math.pow(10,digits) + helper(n/10, digits-1);

    }


    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverse2(num));
        // reverse1(num);
       // System.out.println(sum);
    }


}
