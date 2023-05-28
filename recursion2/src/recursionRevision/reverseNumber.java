package recursionRevision;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverseR(n));

    }

    static int reverseR(int n){
        int digits = (int) Math.log10(n);


        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n == 0){
            return 0;
        }
        int rem = n%10;
        int Rsum = (int) (helper(n/10,digits-1) + Math.pow(10,digits) * rem);
        return Rsum;
    }

    static int reverse (int n){
        int Rnum = 0;
        while(n != 0){
            int rem = n%10;

            Rnum = Rnum*10 + rem;
            n = n/10;
        }
        return Rnum;
    }
}
