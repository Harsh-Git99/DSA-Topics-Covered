package striverSheetRecursion;

public class goodNumber {
    public static void main(String[] args) {


    //    System.out.println(isPrime(37));

        System.out.println(goodNumber(1924));
    }


    static int mod=(int)1e9+7;
    static int goodNumber(int n){

        //count the number of even indexes and number of odd indexes;

        long first=(n%2==0?(n/2):(n/2)+1);
        long second = n/2;

        long mul1 = pow(5,first)%mod;

        long mul2 = pow(4, second) % mod;

        long ans=1;
        ans=(ans*mul1)%mod;
        if (second != 0) ans = (ans * mul2) % mod;
        else ans = ans;
        return (int)(ans%mod);
    }

    static long pow(long x , long y){
        long temp;
        if(y == 0) return 1;

        temp = pow(x,y/2);
        if(y%2==0) return (temp*temp)%mod;
        else return (temp*temp*x)%mod;
    }

}
