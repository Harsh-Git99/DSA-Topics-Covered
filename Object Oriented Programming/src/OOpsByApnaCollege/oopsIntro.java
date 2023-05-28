package OOpsByApnaCollege;


class Pen { //bluePrint
    // specify the bluePrint of  pen
    String color;
    String type;        //ballPoint, Gel etc

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println("its colour is "+this.color);
    }
    public void printType(){
        System.out.println("It's a "+this.type+" type");
    }
}

class Student{

    String name ;
    Integer rollNum;
    Integer Class;

    //function

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.rollNum);
        System.out.println(this.Class);
    }

    //Non parameterized constructor
//    Student() {
//        System.out.println("Constructor called");
//    }

    //parameterized constructor
//    Student(String name, int Class, int rollNum){
//        this.name = name;       // this.name is objects name and the name after = is the name from parameter which was passed.
//        this.Class= Class;
//        this.rollNum = rollNum;
//    }


    //Copy Constructors

    Student(Student s2){
        this.name = s2.name;
        this.Class = s2.Class;
        this.rollNum = s2.rollNum;
    }

    Student(){

    }
}

public class oopsIntro {

    public static void main(String[] args) {

        Student std1 = new Student();
        std1.name= "Harsh";
        std1.Class = 12;


        Student s2 = new Student(std1);
        s2.printInfo();

    }
}
