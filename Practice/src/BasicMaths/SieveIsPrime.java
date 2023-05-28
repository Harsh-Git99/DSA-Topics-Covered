package BasicMaths;

public class SieveIsPrime {
    public static void main(String[] args) {
        int n = 10;

        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }

    //false in array means that the number is prime.
    static void sieve (int n, boolean[] primes ){
        int count=0;
        for (int i = 2; i*i <= n; i++) {
            if(!primes[i]){
                for (int j = i*2; j <= n; j+=i) { //making every multiple of i as false;
                    primes[j]=true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i+" ");
                count+=1;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
