package BitOperators;

public class AND {
    public static void main(String[] args) {
        int n =63;
        System.out.println(isOdd(n));
    }

    static  boolean isOdd(int n){
        return  ((n & 1)==1);
    }
}