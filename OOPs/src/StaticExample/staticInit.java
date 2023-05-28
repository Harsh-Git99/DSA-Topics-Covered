package StaticExample;

//demo to show initialisation of static variables
public class staticInit {
    static int a = 4;
    static int b;

    //static Bloack : it only runs once when the first obj is created
    static {
        System.out.println("I'm in a static block");
        b=a*5;
    }

    public static void main(String[] args) {
        staticInit obj  = new staticInit();

        System.out.println(staticInit.a + " " + staticInit.b);

        staticInit.b +=8;
        System.out.println(staticInit.a + " " + staticInit.b);

    }

}
