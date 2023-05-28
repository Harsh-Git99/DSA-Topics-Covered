package BasicMaths;

public class PrimeNum {
    public static void main(String[] args) {

        int num = 2;


        System.out.println( isPrime(num));

    }

    static boolean isPrime(int num) {
        for (int i = 2; i < (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;

            }
        }
            return true;



    }
}


