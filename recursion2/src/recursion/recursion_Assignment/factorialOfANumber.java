package recursion.recursion_Assignment;

public class factorialOfANumber {
    public static void main(String[] args) {
        int n = 5;

       // System.out.println(fact(n));
        System.out.println(factRecursion(n));

    }

    static int factRecursion(int n){
        if(n < 1){
            return 1;
        }
        int result = n * factRecursion(n-1);
        return result;
    }

    static int fact(int n ){
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
