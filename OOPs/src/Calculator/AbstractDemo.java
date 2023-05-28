package Calculator;

class Pen extends  Kit{
    public void write(){
        System.out.println("I'm a pen");
    }
}

class Pencil extends  Kit{
    public void write(){
        System.out.println("I'm a Pencil");
    }

}


 class  Kit{
    public void doSomething(Pen p){
        p.write();
    }
}


public class AbstractDemo{
    public static void main(String[] args) {

        Kit obj = new Kit();
        Pen p = new Pen();

        obj.doSomething(p);
    }
}
