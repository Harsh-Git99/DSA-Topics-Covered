package Functions;

public class Scoping {
    public static void main(String[] args) {
        int a =40;
        int b = 30;

        //Scoping in Block
        {
            //int a , "a" cant be initialized again in the block but can be modified and be sent again outside with the modified value
            a=70;
            int c =23;  // Values initialized in the Block will remain in the block (i.e. cant be accessed by the outside operations)
        }

        System.out.println(a); // will give the modified value of "a".
    }
}
