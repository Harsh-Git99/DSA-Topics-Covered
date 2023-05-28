package Calculator;


class Employee{
    int eid;
    int salary;
    static String ceo;

    static {    //to initialise static variables
        ceo = "Mr White";
    }

    public Employee(){  //to initialise nonStatic variables
        eid = 01;
        salary = 1000;
    }


    public void show(){
        System.out.println(eid+" "+salary+"  "+ceo);
    }

}
public class StaticDemo {
    public static void main(String[] args) {

        Employee navin = new Employee();
//        navin.eid =1;
//        navin.salary = 8000;
//        Employee.ceo = "Tuco";
//
        Employee aman  = new Employee();
//        aman.eid = 2;
//        aman.salary = 9000;
//        Employee.ceo = "Tuco";      //for data of static type, we use class name
//
//        Employee.ceo = "Jessy";

        navin.show();

        aman.show();


    }
}
