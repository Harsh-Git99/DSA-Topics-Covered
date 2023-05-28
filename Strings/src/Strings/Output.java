package Strings;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        // println is calling valueOf which is then calling Integer.toString() method

        System.out.println("Kunal");
        // println is calling valueOf which is then calling obj.toString() method

        System.out.println(new int[]{2,3,4,5});
        //here it says that print an object(it prints something random)
        // println is calling valueOf which is then calling obj.toString() method

        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));
        //Arrays.toString prints the object in a much more human understandable way(aka pretty Print)
        //this is called FunctionOverriding



    }
}
