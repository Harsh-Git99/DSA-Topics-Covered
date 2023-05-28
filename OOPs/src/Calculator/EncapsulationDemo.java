package Calculator;

class Student{
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(2);
        s1.setName("Navin");
        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
    }
}
