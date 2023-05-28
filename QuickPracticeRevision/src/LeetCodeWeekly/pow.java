package LeetCodeWeekly;

public class pow {
    public static void main(String[] args) {
        double x = 2.10000;
        int n = 3;

        System.out.println(myPow(x,n));

    }

    static double myPow(double x, int n) {
        if(n == 0) return 1;

        if(n > 0){
            return myPowHelper1(x,n,1,1);
        }else return myPowHelper2(x,n,1,1);
    }

    static double myPowHelper1(double x, int n , double ans, int i ){
        if(i > n){
            return ans;
        }
        ans = ans*x;
        return myPowHelper1(x,n,ans,i+1);
    }

    static double myPowHelper2(double x, int n , double ans, int i ){
        if(i > n){
            return ans;
        }
        ans = 1/(ans*x);
        return myPowHelper2(x,n,ans,i+1);
    }


}
