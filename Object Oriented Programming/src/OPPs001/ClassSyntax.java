package OPPs001;

public class ClassSyntax {
    public static void main(String[] args) {

    Student kunal = new Student();

    kunal.rollNum=33;
    kunal.name = "Harsh";
    kunal.marks=76.2f;
        System.out.println(kunal.rollNum);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

    }

    //create a class
    //for every single Student
    static class Student {
        int rollNum ;
        String name ;
        float marks ;
    }


}