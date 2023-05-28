package Functions;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

       boolean ans = prime(num);
        System.out.println(ans);
    }

    static boolean prime(int num) {

        if (num <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > 0;
    }

}
