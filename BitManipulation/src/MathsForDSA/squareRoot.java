package MathsForDSA;

public class squareRoot {
    public static void main(String[] args) {
        int number = 40;
        int precision = 3;
        System.out.println(squareRoot(number));

        System.out.printf("%3f",PreciseSqrt( number, precision));       //it is taking O(log(n))
    }

    static  int squareRoot(int n){
        int start =0;
        int end = n;

        while (start < end){
            int mid = start +(end-start)/2;
            if(mid*mid == n){
                return mid;
            }
            if(mid*mid > n ){
                end =mid-1;
            }
            else
                start = mid +1;
        }
        return -1;
    }

    static  double PreciseSqrt(int n, int p){
        int start =0;
        int end = n;

        double root = 0.0;

        while (start < end){
            int mid = start +(end-start)/2;

            if(mid*mid == n){
                return mid;
            }
            if(mid*mid > n ){

                end =mid-1;
            }
            else
                start = mid +1;
        }

        double incr =0.1;
        for (int i = 0; i < p; i++) {

            while(root*root <= n){
                root +=incr;
            }

            root-=incr;

            incr /=10;

        }

        return root;
    }
}
