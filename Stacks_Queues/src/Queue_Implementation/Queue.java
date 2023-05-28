package Queue_Implementation;

public class Queue {

    protected  int[] data ;
    private  static final int DEFAULT_SIZE = 10;

    int end = 0;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size){
        this.data = new int[size];
    }


    public boolean isFull(){
        return  end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public  boolean insert(int item){
        if(isFull()){
            System.out.println("The Queue is full");
            return false;
        }
        data[end]=item;
        end++;
        return true;
    }

    public int remove (){
        if(isEmpty()){
            return -1;
        }

        int removed = data[0];
        for (int i = 0; i < end-1; i++) {
            data[i] = data[i+1];
        }
        end--;
     return removed;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }

        int front = data[0];
        System.out.println();
        System.out.println(front);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] +" ");
        }
    }
}
