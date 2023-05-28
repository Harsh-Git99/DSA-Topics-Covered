package recursion.BasicsChap1;

public class FactorialOfNum {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(facto(num));

    }

    static int facto(int n){
        if(n == 1){
            return n;
        }

        return   n * facto(n-1);

    }
}
