package stack_Implementation;

public class stack {

    protected  int[] data;
    private static final int DEFAULT_SIZE =10;

    int pointer = -1;
    public stack(){         // if no size is specified then use default size

        this(DEFAULT_SIZE);     // this keyword checks for a method which takes in the integer
                                // and send Default size as parameter
    }

    public stack (int size){        // when a stack_Implementation.stack is initialised its size should be as specified
        this.data=new int[size];
    }

    public boolean push (int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        pointer++;
        data[pointer]=item;
        return true;
    }

    private boolean isFull() {
        return pointer== data.length-1; //pointer is at the last index.
    }
    private boolean isEmpty(){
        return  pointer == -1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int removedItem = data[pointer];
        pointer--;
        return removedItem;

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return data[pointer];
    }
}
