package CircularQueue;

public class circular {

    protected  int[] data;
    private  static final int DEFAULT_SIZE = 10;
    int front = 0;
    int end = 0;
    int size = 0;

    public circular() {
        this(DEFAULT_SIZE);
    }

    public  circular(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return  size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove (){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int removed = data[front];
        front++;


        front = front% data.length;
        size--;

        return removed;
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        System.out.println();
        System.out.println(data[front]);
    }

    public void display (){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }

       int i = front;
        do{
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;
        }while(i!=end);
        System.out.println("End");


    }

}
