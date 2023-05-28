package Functions;

public class Shadowing {
    static int x = 90;      //this will be shadowed at line 8 (SHADOWING)
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x);

    }
}
