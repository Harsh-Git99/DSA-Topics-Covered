package recursionRevision;

public class CountNumOfZeros {
    public static void main(String[] args) {
        int n = 1000;

       // System.out.println(countZeros(n));

        System.out.println(countR(n,0));
    }

    static int countR(int n, int ct){
        if(n == 0){
            return ct;
        }
        int rem = n%10;
        if(rem == 0) ct++;
        return countR(n/10,ct);
    }

    static int countZeros(int n){

        int count = 0;

        while (n != 0){
            int rem = n%10;
            if(rem == 0) count++;
            n = n/10;
        }
        return count;
    }
}
