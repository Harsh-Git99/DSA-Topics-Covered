package OPPs001.Static_example;

public class Main {
    public static void main(String[] args) {
        Human raj = new Human(23,"Raj", 10000,true);
        Human Dan = new Human(23,"Dan", 10000,false);

        System.out.println(raj.population);
        System.out.println(Dan.population);

    }
}
