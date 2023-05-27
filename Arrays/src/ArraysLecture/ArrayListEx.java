package ArraysLecture;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list1 = new ArrayList<>(4);     // we can enter much more data items than initially specified

        list1.add(64);
        list1.add(24);
        list1.add(4);
        list1.add(364);
        list1.add(644);
        list1.add(645);

        System.out.println(list1.contains(24));
        System.out.println("");
        System.out.println(list1.contains(2324));
        System.out.println("");
        list1.set(0,99);        //updates 0th index to 99
        System.out.println(list1);

       // get item at any index

        for (int i = 0; i < 5; i++) {
            System.out.println(list1.get(i));       //pass index here, list[index] syntax won't work here
        }

    }
}
