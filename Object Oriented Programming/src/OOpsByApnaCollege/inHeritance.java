package OOpsByApnaCollege;

class Shape{
    String color;
}

class Triangle extends Shape{       //i.e. OOpsByApnaCollege.Triangle class has inherited the properties of OOpsByApnaCollege.Shape class.


}

public class inHeritance{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
