package BasicMaths;

public class NumReverse {
    public static void main(String[] args) {

        int num = 1534236469;
        int rev = 0;

        while (num!=0) {
            int digit = num % 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println(0);
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && digit < 8)) {
                System.out.println(0);
            }

            else{
                rev = rev*10 + digit;
            }

            num = num / 10;
        }
            System.out.println(rev);

    }
}
