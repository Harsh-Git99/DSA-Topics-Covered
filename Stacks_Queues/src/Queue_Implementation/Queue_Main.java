package Queue_Implementation;

public class Queue_Main {
    public static void main(String[] args) {
        Queue que = new Queue(5);

        que.insert(4);
        que.insert(2);
        que.insert(3);
        que.insert(5);
        que.insert(6);

        que.display();

        que.peek();

        que.remove();

        que.display();

    }
}
