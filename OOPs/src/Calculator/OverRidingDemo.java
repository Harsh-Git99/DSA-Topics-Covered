package Calculator;

class X {
    public void show(){
        System.out.println("in X");
    }
}

class Y extends X{

    @Override
    public void show(){
        super.show();
        System.out.println("in Y");
    }

}
public class OverRidingDemo {
    public static void main(String[] args) {
        Y obj1 = new Y();
        obj1.show();
    }
}
