package Abstract;

public  class Son extends Parent {

    public Son(int age) {
        this.age = age;
    }

    @Override
    void career(String career, int age) {
        System.out.println("I'm going to be a "+ career + " age "+ age);

    }

    @Override
    void partner(String name ,int age) {
        System.out.println("I love " + name + "and she is of " + age);

    }
}
