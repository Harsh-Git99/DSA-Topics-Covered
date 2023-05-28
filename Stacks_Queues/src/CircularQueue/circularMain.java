package CircularQueue;

public class circularMain {
    public static void main(String[] args) {
        circular cirQue = new circular(5);

        cirQue.insert(2);
        cirQue.insert(3);
        cirQue.insert(5);
        cirQue.insert(6);
        cirQue.insert(1);

        cirQue.display();

        System.out.println(cirQue.remove());
        cirQue.insert(343);
        cirQue.display();



    }
}
