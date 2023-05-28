package Generics;

import java.util.ArrayList;

public class CustomeArrayList {

    private int[] data;     //you cant directly change it, but can only change it using methods
    private static int Default_Size = 10;
    private int size = 0;

    public CustomeArrayList() {
        this.data = new int[Default_Size];
    }

    public void add(int num){
        if(isFull()){

        }
        data[size++] = num;

    }

    private void resize(){
        int[] temp = new int[data.length*2];

        //copy the data of current array into new array temp;

        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data = temp;

    }

    public int remove(){
        int removedItem = data[--size];     //here we are not actually deleting the value from the array but
        return removedItem;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
    }
}
