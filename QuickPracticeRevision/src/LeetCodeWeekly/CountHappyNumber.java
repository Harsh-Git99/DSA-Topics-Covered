package LeetCodeWeekly;

public class CountHappyNumber {
    public static void main(String[] args) {
        long n = 3;

    //    System.out.println(isHappy(2563));

        System.out.println( countGoodNumbers(n));

    }

    static int countGoodNumbers(long n) {

        int count = 0;

        for (double i = Math.pow(10,n-1); i < Math.pow(10,n); i++) {
            if(isHappy((int) i)){
                System.out.println(i);
                count++;
            }
        }

        return count;
    }

    static boolean isHappy(int n) {
        int j = digitsInNum(n)-1;
        while(n != 0){
            int rem = n%10;
            if(j % 2 == 0 && rem%2 == 0){
                j--;
                n = n/10;
                continue;
            }else if(j % 2 != 0 && isPrime(rem)){
                j--;
                n = n/10;
                continue;
            }else return false;
        }
        return true;
    }

    private static int digitsInNum(int n) {
        int i = 0;
        while (n != 0){
            int rem = n%10;
            i++;
            n = n/10;
        }
        return i;
    }


    static boolean isPrime(int num){
        if(num == 1 || num == 0) return false;
        for (int i = 2 ; i*i <= num ; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }


}
