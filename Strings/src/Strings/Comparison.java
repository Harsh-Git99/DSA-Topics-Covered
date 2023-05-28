package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Harsh";
        String b = "Harsh";

        //to check if both the ref variable are pointing to the same pool

        // we use ==

        // if it is correct then it will return "True".

       // System.out.println(a==b);

        //explicitly ask String to make a new object using new
        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println(name1==name2);
        // This will give **False** as both the objects are created saperately outside POOL within heap.

        //to only check the values of ref variables
        System.out.println(name1.equals(name2));

        //to get a specific character from the string .charAt()

        System.out.println(name1.charAt(0));

    }
}
