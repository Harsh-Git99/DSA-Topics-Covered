package recursionRevision;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumR(n));
    }

    static int sumR(int n ){
        if(n == 0) {
            return 0;
        }
            int rem = n%10;
            int sum = rem + sumR(n/10);
            return sum;

    }

    static int sum (int n){
        int sum = 0;

        while(n != 0){
           int rem = n%10;
            sum +=rem;
            n = n/10;
        }
        return sum;
    }


}
