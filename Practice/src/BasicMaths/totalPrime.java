package BasicMaths;

public class totalPrime {
    public static void main(String[] args) {

        System.out.println(totalPrime(10));
    }

    static int totalPrime(int num) {
        if (num == 0 && num == 1) {
            return 0;
        }
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                count += 1;
            }

        }
        return count;
    }
    static boolean isPrime(int num){
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
