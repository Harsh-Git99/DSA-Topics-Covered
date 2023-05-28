package singleton;

public class Main {
    public static void main(String[] args) {
        singleton obj =  singleton.getInstance();

        singleton obj2 =  singleton.getInstance();

        singleton obj3 =  singleton.getInstance();

        //all three ref variables are pointing to just one object
    }

}
