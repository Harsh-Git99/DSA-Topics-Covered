package StaticExample;
public class human {
    int age;
    String name;
    boolean married;

    String occupation;

    static long population;

    static void message(){
        System.out.println("hello world");
        human h = new human(23,"harsh", true, "sde");

        System.out.println(h.age);
    }

    public human(int age, String name, boolean married, String occupation) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.occupation = occupation;
        human.population += 1;
    }
}
