package recursionRevision;

public class fibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        //836311896
        System.out.println(fibo(n));
    }

    static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }

       int sum =  (fibo(n-1) + fibo(n-2))%1000000007;
        return sum;
    }

    static long fibo2(int n){
        long fSum = 0;
        long a = 1;
        long b = 1;
        if(n <= 2) return 1;

        for (int i = 3; i <= n; i++) {

            fSum  = (a + b)%1000000007;
            a = b;
            b = fSum;
        }

        return fSum;
    }

}
