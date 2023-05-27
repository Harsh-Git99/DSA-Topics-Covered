package ArraysLecture;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntx
         ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

         // initialisation (otherwise it will put Null as the value and wont take new values and will give ERROR)
        for (int i = 0; i < 3; i++) {
            list2.add(new ArrayList<>());
        }

        //add element

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2.get(i).add(in.nextInt());
            }
        }

        System.out.println(list2);
    }
}
