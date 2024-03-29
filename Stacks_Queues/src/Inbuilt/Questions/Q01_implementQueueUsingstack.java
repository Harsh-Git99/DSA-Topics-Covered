package Inbuilt.Questions;

import java.util.Queue;
import java.util.Stack;

public class Q01_implementQueueUsingstack {
    public static void main(String[] args) {



    }

    class QueueUsingStacks{

        private Stack<Integer> first;
        private Stack<Integer> second;

        public QueueUsingStacks(){
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item){
            first.push(item);

        }

        public int remove (){
            while (!first.isEmpty()){
                second.push(first.pop());
            }
            int removed = second.pop();

            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return removed;
        }

        public boolean Empty(){
            return first.isEmpty();
        }

        public int peek(){
            while (!first.isEmpty()){
                second.push(first.pop());
            }
            int peeked = second.peek();

            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return peeked;
        }

    }
}
