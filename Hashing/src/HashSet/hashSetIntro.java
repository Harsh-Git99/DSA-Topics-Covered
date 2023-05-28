package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetIntro {
    public static void main(String[] args) {

       // initialize
        HashSet<Integer> set = new HashSet<>();

        //addition
        set.add(1);
        set.add(1); // sets does not allow duplicates , thats why this value of 1 will be skipped.
        set.add(2);
        set.add(3);


        //search
        set.contains(1);    //gives boolean


        // deletion
        set.remove(2);

        //to know the size of the set
        set.size();

        //print out the entire set

        System.out.println(set);

        //iterate

        Iterator it = set.iterator();

        it.next();
        it.hasNext();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}