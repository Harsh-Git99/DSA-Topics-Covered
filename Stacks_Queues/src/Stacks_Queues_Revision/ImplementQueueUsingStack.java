package Stacks_Queues_Revision;

public class ImplementQueueUsingStack {

    protected int[] data;
    public static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public ImplementQueueUsingStack (){
        this(DEFAULT_SIZE);
    }


    public ImplementQueueUsingStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int x){
        if(isFull()){
            System.out.println("Stack is full");
        }
        ptr++;
        data[ptr] = x;
        return true;
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }
}
