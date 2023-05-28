package Arrays.ArraysMedium;

import java.util.ArrayList;
import java.util.Stack;

public class LeadersInAnArray {
    public static void main(String[] args) {

        int arr[] = {16,17,4,3,5,2};
        System.out.println(leaders1(arr));
    }

    static  ArrayList<Integer> leaders1(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length-1]);
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i] > stack.peek()){
                stack.push(arr[i]);
            }
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }




    //BruteForce
    static  ArrayList<Integer> leaders(int arr[]){

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    break;
                }else{
                    if(j >= arr.length-1){
                        list.add(arr[i]);
                    }
                }
            }
        }
        list.add(arr[arr.length-1]);
        return list;
    }
}
