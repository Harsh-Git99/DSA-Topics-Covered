package recursionRevision;

public class fact {
    public static void main(String[] args) {
        int  n = 13;

        System.out.println(factorial(n));

    }
    static long factorial(int N){
        // code here
        long pro = 1;
        for(int i = N; i > 0; i--){
            pro *= i;
        }
        return pro;
    }
}
