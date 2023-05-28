package Calculator;

class Calc{

    int num1;
    int num2;
    int result;

    public  Calc(){     //Default constructor
        num1 = 5;
        num2 = 8;
    }

    public  Calc(int n){    //parameterized constructor
        num1 = n;
         num2 = 2*n;
    }

    public  Calc(double d){
        num1 = (int) d;
    }

    public void perform(){
        result = num1 + num2;
    }

}
public class CalcObj {
    public static void main(String[] args) {
        Calc obj = new Calc(7.3);      //ref = new obj




        obj.perform();

        System.out.println(obj.result);


    }
}
