package recursion.BasicsChap1;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1345431;
        //System.out.println(isPalin(num));

        reverse(num);
        if(num == reverseSum){
            System.out.println(true);
        }else System.out.println(false);
    }
    //




    //using variable outside recursive func

    static int reverseSum = 0;

    static void reverse(int num){
        if(num == 0){
            return ;
        }

        int rem = num%10;

        reverseSum = reverseSum * 10 + rem;
        reverse(num/10);

    }


    // using helper method
    static boolean isPalin(int num){

        int digits  = (int) Math.log10(num);
        int reverse =  helper( num, digits );
        return num == reverse;
    }

   private static int helper (int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits) + helper(n/10, digits-1);
    }

}
