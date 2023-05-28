package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        //when an integer is added to a string,
        // it is converted to its rapper class Integer which will call toString()

        System.out.println("kunal"+new ArrayList<>());
    }
}
