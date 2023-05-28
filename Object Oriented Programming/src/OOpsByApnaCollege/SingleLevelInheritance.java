package OOpsByApnaCollege;


class Shape1{
    public  void area(){
        System.out.println("Displays area");
    }
}
class Triangle1 extends Shape {
    public void area (int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape1{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }


}
public class SingleLevelInheritance {
    public static void main(String[] args) {

    }
}
