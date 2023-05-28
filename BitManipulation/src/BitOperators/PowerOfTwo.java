package BitOperators;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n= 16;

        isPowerOfTwo(n);

        System.out.println("The given value is a Power of two : statement is "+isPowerOfTwo2(n));
       }

    static void  isPowerOfTwo(int n ){
        int count=0;
        while  (n>0){
            int last = n&1;     //gives the last number
            n=n>>1;     //shifts the binary number to left to right side by one place
            if (last == 1) {
                count++;
            }
        }
        if (count ==1){
            System.out.println("It is power of two");
        }else
            System.out.println("It is not a power of two");
    }

    //OR
    static  boolean isPowerOfTwo2 (int n){

        if (n==0){
            return false;
        }
        if((n & (n-1)) ==0){        // 16 = 10000 AND 15=1111 == 0
            return true;
        }
        return false;
    }
}
