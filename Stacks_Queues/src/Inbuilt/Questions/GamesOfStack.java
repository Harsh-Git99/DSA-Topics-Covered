package Inbuilt.Questions;

import java.util.Stack;

public class GamesOfStack {
    public static void main(String[] args) {
        int Max_Sum = 10;

        Stack<Integer> first = new Stack<>();
        first.push(7);
        first.push(1);
        first.push(1);
        first.push(1);
        first.push(1);
        Stack<Integer> second = new Stack<>();

        second.push(5);
        second.push(8);
        second.push(1);
        second.push(2);

        System.out.println(  sumCount(first,second,Max_Sum));

    }



    static  int sumCount(Stack first, Stack second, int Max){
        int sum=0;
        int count = 0;
        do{
            if ((int) first.peek() < (int) second.peek()) {
                int firstEle = (int) first.peek();

                if (sum + firstEle <= Max) {
                    sum = sum + firstEle;
                    count++;
                    first.pop();
                }
            }  if ((int) first.peek() > (int) second.peek()) {
                int secEle = (int) second.peek();
                if (sum + (int) second.peek() <= Max) {
                    sum = sum + (int) second.peek();
                    count++;
                    second.pop();
                }
            }
            else {
                if(sum + (int) first.peek() > Max || sum + (int) first.peek() > Max){
                    break;
                }
            }


        }while(sum <= Max);


        return count;
    }


}
