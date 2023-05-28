package Calculator;

 class Outer{
    int a;

    public  void  show(){

    }

    // we can create a class inside a class
     class Inner{
        public  void  display(){
            System.out.println("in display");
        }
    }

}
public class InnerDemo {
    //we can create variable, methods in a class

    public static void main(String[] args) {

        Outer obj  = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner() ;
        obj1.display();

    }
}
