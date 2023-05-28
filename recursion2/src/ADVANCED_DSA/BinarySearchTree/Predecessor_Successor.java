package ADVANCED_DSA.BinarySearchTree;

import java.util.Stack;

public class Predecessor_Successor {
    public static void main(String[] args) {
        Node node = new Node(50);
        node.left = new Node(30);
        node.left.right = new Node(40);
        node.left.left = new Node(20);


        node.right = new Node(70);
        node.right.right = new Node(80);
        node.right.left = new Node(60);

        System.out.println(ceiling(node,65));
        System.out.println(floor(node,65));

    }

    public static void findPreSuc(Node root, int p, int s, int key)
    {
        // add your code here

        s = ceiling(root,key);
        p = floor(root,key);


    }

    static int ceiling(Node root, int key) {
        int ans = -1;

        Stack<Integer> stack = new Stack<>();

        while(root!=null){
            if(key >= root.data ){
                root= root.right;
            } else if (key < root.data ) {
                ans = root.data;
                if(stack.isEmpty()) stack.push(ans);
                else {
                    if(ans < stack.peek() ){
                        stack.pop();
                        stack.push(ans);
                    }
                }
                root= root.left;
            }
        }
        return stack.peek() ;
    }

    static int floor(Node root, int key) {
        int ans = -1;

        Stack<Integer> stack = new Stack<>();

        while(root!=null){
            if(key > root.data ){
                ans = root.data;
                if(stack.isEmpty()) stack.push(ans);
                else {
                    if(ans > stack.peek()){
                        stack.pop();
                        stack.push(ans);
                    }
                }
               root = root.right;
            } else if (key <= root.data ) {
                root= root.left;

            }
        }
        return stack.peek() ;
    }


}
