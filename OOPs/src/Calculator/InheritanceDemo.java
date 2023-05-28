package Calculator;

class Calcu{        //superClass , Parent , Base
    public int add(int i, int j){
        return i+j;
    }
}

class CalcAdv extends  Calcu {      //subClass, child, derived

    // we don't need this anymore as this method is inherited from class Calc
//    public int add(int i, int j){
//        return i+j;
//    }
    public int sub(int i, int j){
        return i-j;
    }
}

class  VeryAdvCalc extends CalcAdv {

    public  int multi (int i, int j){
        return i*j;
    }

    public  int divide (int i, int j){
        return i/j;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        VeryAdvCalc c1 = new VeryAdvCalc();
         int result1 = c1.add(3,5);
         int result2 = c1.sub(3,4);
         int result3 = c1.multi(3,4);
         int result4 = c1.divide(3,4);

        System.out.println(result1 + " "+ result2+" "+ result3 + " "+ result4);

    }
}
