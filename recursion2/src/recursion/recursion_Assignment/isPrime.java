package recursion.recursion_Assignment;

public class isPrime {
    public static void main(String[] args) {
        int n = 17;

        System.out.println(isPrime(n));
        System.out.println(isPrimeRecursive(n,2));

    }

    static boolean isPrimeRecursive(int n, int i){
        if(i*i > n){
            return true;
        }
        if(n%i==0){
            return isPrimeRecursive(n,i+1);
        }else return isPrimeRecursive(n,i+1);
    }

    static boolean isPrime(int n){

        for (int i = 2; i*i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}
