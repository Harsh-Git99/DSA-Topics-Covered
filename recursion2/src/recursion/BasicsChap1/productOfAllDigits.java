package recursion.BasicsChap1;

public class productOfAllDigits {
    public static void main(String[] args) {
        int num = 505 ;
        System.out.println(digitProduct(num));

    }

    static int digitProduct(int num){
        if(num/10 == 0){
            return num;
        }
        int rem = num % 10;
        return rem * digitProduct(num/10);
    }
}
