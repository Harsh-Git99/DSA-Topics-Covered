package Interface;

public class Car implements Engine , Brake, Media {
    //as these are abstract methods therefore we need to implement these
    @Override
    public void brake() {
        System.out.println("Brakes are normal");

    }

    @Override
    public void start() {
        System.out.println("Start is normal");
    }

    @Override
    public void stop() {
        System.out.println("Car is stoped");

    }

    @Override
    public void accelerate() {

        System.out.println("Acceleration is normal");

    }



}
